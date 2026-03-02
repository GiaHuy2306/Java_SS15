package ex02;

import java.util.ArrayDeque;
import java.util.Queue;

public class PatientQueue {

    Queue<Patient> queue = new ArrayDeque<>();

    public void addPatient(Patient p){
        queue.offer(p);
    }

    public Patient callNextPatient(){
        if (queue.isEmpty()){
            return null;
        }else {
            Patient p = queue.poll();
            System.out.println("Đang khám cho bệnh nhân: " +p.getName());
            return p;
        }
    }

    public Patient peekPatient(){
        if (queue.isEmpty()){
            System.out.printf("Hàng đợi trống");
            return null;
        }else {
            Patient next = queue.peek();
            System.out.println("Bệnh nhân tiếp theo: " +next.getName());
            return next;
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void displayPatients(){
        if (queue.isEmpty()){
            System.out.println("Chưa có bệnh nhân nào");
            return;
        }else {
            System.out.println("Danh sách bệnh nhân trong hàng chờ: ");
            for (Patient p : queue){
                System.out.println(p);
            }
        }
    }
}
