package ex03;

public class Ex03 {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        // Trường hợp hợp lệ
        String[] case1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(case1);

        System.out.println();
        checker.reset();

        // Trường hợp POP khi rỗng
        String[] case2 = {"PUSH", "POP", "POP"};
        checker.checkProcess(case2);

        System.out.println();

        checker.reset();

        // Trường hợp còn thuốc chưa hoàn tất
        String[] case3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(case3);
    }
}
