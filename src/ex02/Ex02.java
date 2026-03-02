package ex02;

public class Ex02 {
    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();

        patientQueue.addPatient(new Patient("BN01", "Nguyễn Văn A", 30));
        patientQueue.addPatient(new Patient("BN02", "Trần Thị B", 25));
        patientQueue.addPatient(new Patient("BN03", "Lê Văn C", 40));

        patientQueue.displayPatients();

        // Gọi bệnh nhân đầu hàng
        patientQueue.callNextPatient();

        // Xem bệnh nhận tiếp theo
        patientQueue.peekPatient();

        patientQueue.displayPatients();
    }
}
