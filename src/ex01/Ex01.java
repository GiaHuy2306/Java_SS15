package ex01;

public class Ex01 {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật chẩn đoán", "02/03/2026 09:00"));
        history.addEdit(new EditAction("Thêm kết quả xét nghiệm", "02/03/2026 09:15"));
        history.addEdit(new EditAction("Chỉnh sửa đơn thuốc", "02/03/2026 09:30"));

        history.displayHistory();

        System.out.println("Chinh sua gan nhat: ");
        history.getLatestEdit();

        System.out.println("Undo: ");
        history.undoEdit();
        history.displayHistory();

        System.out.println("Sau khi undo: ");
        history.displayHistory();
    }
}
