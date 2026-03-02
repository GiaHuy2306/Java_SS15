package ex05;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases = new LinkedList<>();

    // Thêm ca cấp cứu
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã tiếp nhận ca: " + c.getPatient().getName());
    }

    // Lấy ca tiếp theo
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu.");
            return null;
        }

        EmergencyCase c = cases.poll();
        System.out.println("Đang xử lý ca: " + c.getPatient().getName());
        return c;
    }
}
