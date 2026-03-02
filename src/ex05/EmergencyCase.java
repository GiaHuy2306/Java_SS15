package ex05;

import ex02.Patient;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    // Thêm bước xử lý
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước: " + step.getDescription());
    }

    // Undo bước gần nhất
    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            TreatmentStep removed = steps.pop();
            System.out.println("Undo bước: " + removed.getDescription());
            return removed;
        } else {
            System.out.println("Không có bước nào để undo.");
            return null;
        }
    }

    // Hiển thị các bước đã thực hiện
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý.");
            return;
        }

        System.out.println("=== QUY TRÌNH XỬ LÝ ===");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }
}
