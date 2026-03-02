package ex04;

public class Ex04 {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("BN01", "Nguyễn Văn A", 2));
        eq.addPatient(new EmergencyPatient("BN02", "Trần Thị B", 1));
        eq.addPatient(new EmergencyPatient("BN03", "Lê Văn C", 2));
        eq.addPatient(new EmergencyPatient("BN04", "Phạm Văn D", 1));

        System.out.println("\nDanh sách chờ:");
        eq.displayQueue();

        System.out.println("\nGọi khám lần lượt:");
        while (eq.callNextPatient() != null) {
        }
    }
}
