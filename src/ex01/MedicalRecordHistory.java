package ex01;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction> history = new Stack<EditAction>();

    public void addEdit(EditAction action){
        history.push(action);
    }

    public EditAction undoEdit(){
        if (!history.isEmpty()){
            EditAction removed = history.pop();
            System.out.println("Da xoa undo chinh sua: " +removed.toString());
            return removed;
        }

        System.out.println("Danh sach undo rong");
        return null;
    }

    public EditAction getLatestEdit() {
        if (!history.isEmpty()){
            return history.peek();
        }

        System.out.println("Chua co chinh sua nao");
        return null;
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }

    public void displayHistory(){
        if (history.isEmpty()){
            System.out.println("Chưa chỉnh sửa lần nào");
        }else {
            for (int i=history.size()-1;i>=0;i--){
                System.out.println(history.get(i));
            }
        }
    }
}
