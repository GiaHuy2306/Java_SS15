package ex04;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    private Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.offer(p);
            System.out.println("Đã tiếp nhận bệnh nhân (Cấp cứu): " + p.getName());
        }else if (p.getPriority() == 2) {
            normalQueue.offer(p);
            System.out.println("Đã tiếp nhận bệnh nhân (Bình thường): " + p.getName());
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQueue.isEmpty()) {
            EmergencyPatient p = emergencyQueue.poll();
            System.out.println("Đang khám (Cấp cứu): " + p.getName());
            return p;
        }else if (!normalQueue.isEmpty()) {
            EmergencyPatient p = normalQueue.poll();
            System.out.println("Đang khám (Bình thường): " + p.getName());
            return p;
        }

        System.out.println("Không có bệnh nhân nào");
        return null;
    }

    public void displayQueue() {

        if (emergencyQueue.isEmpty() && normalQueue.isEmpty()) {
            System.out.println("Hàng đợi trống.");
            return;
        }

        System.out.println("=== DANH SÁCH ĐANG CHỜ ===");

        if (!emergencyQueue.isEmpty()) {
            System.out.println("---- CẤP CỨU ----");
            for (EmergencyPatient p : emergencyQueue) {
                System.out.println(p);
            }
        }

        if (!normalQueue.isEmpty()) {
            System.out.println("---- THƯỜNG ----");
            for (EmergencyPatient p : normalQueue) {
                System.out.println(p);
            }
        }
    }
}
