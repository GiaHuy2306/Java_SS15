package ex05;

import ex02.Patient;

public class Ex05 {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("BN01", "Nguyễn Văn A", 30);
        Patient p2 = new Patient("BN02", "Trần Thị B", 25);

        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        queue.addCase(case1);
        queue.addCase(case2);

        // Lấy ca đầu tiên xử lý
        EmergencyCase current = queue.getNextCase();

        current.addStep(new TreatmentStep("Tiếp nhận bệnh nhân", "09:00"));
        current.addStep(new TreatmentStep("Chẩn đoán ban đầu", "09:10"));
        current.addStep(new TreatmentStep("Tiêm thuốc", "09:20"));

        current.displaySteps();

        System.out.println("\nThực hiện Undo:");
        current.undoStep();

        System.out.println("\nQuy trình sau Undo:");
        current.displaySteps();
    }
}
