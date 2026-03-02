package ex06;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("===== 1. TEST BỆNH NHÂN CHỜ KHÁM =====");

        PatientWaitingQueue waitingQueue = new PatientWaitingQueue();

        waitingQueue.addPatient(new PatientInfo("BN01", "Nguyễn Văn A", 30, "Nam"));
        waitingQueue.addPatient(new PatientInfo("BN02", "Trần Thị B", 25, "Nữ"));
        waitingQueue.addPatient(new PatientInfo("BN03", "Lê Văn C", 40, "Nam"));

        System.out.println("Tổng số đang chờ: " + waitingQueue.getTotalPatients());

        PatientInfo nextPatient = waitingQueue.callNext();
        System.out.println("Đang khám: " + nextPatient);

        System.out.println("Còn lại: " + waitingQueue.getTotalPatients());



        System.out.println("\n===== 2. TEST LỊCH SỬ CHỈNH SỬA =====");

        MedicalRecordHistoryEx06 history = new MedicalRecordHistoryEx06("REC001");

        history.addEdit(new EditActionEx06("Thêm chẩn đoán", "Bác sĩ A", "09:00"));
        history.addEdit(new EditActionEx06("Cập nhật đơn thuốc", "Bác sĩ B", "09:10"));
        history.addEdit(new EditActionEx06("Chỉnh sửa kết quả xét nghiệm", "Bác sĩ C", "09:20"));

        System.out.println("Undo chỉnh sửa gần nhất:");
        System.out.println(history.undoEdit());



        System.out.println("\n===== 3. TEST HỆ THỐNG GỌI SỐ =====");

        TicketSystem ticketSystem = new TicketSystem();

        Ticket t1 = ticketSystem.issueTicket("08:00");
        Ticket t2 = ticketSystem.issueTicket("08:05");
        Ticket t3 = ticketSystem.issueTicket("08:10");

        System.out.println("Gọi số tiếp theo: " + ticketSystem.callNext().getTicketNumber());
        System.out.println("Gọi số tiếp theo: " + ticketSystem.callNext().getTicketNumber());



        System.out.println("\n===== 4. TEST HOÀN TÁC NHẬP LIỆU =====");

        UndoManager undoManager = new UndoManager(5);

        undoManager.addAction(new InputAction("Tên", "An", "Anh", "10:00"));
        undoManager.addAction(new InputAction("Tuổi", "20", "21", "10:02"));
        undoManager.addAction(new InputAction("Địa chỉ", "HN", "HCM", "10:05"));

        System.out.println("Undo thao tác:");
        InputAction undone = undoManager.undo();
        System.out.println(undone);

        System.out.println("Undo tiếp:");
        System.out.println(undoManager.undo());
    }
}
