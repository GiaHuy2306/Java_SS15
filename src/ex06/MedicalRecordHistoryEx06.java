package ex06;

import java.util.Stack;

public class MedicalRecordHistoryEx06 {
    private Stack<EditActionEx06> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistoryEx06(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditActionEx06 action) {
        editStack.push(action);
    }

    public EditActionEx06 undoEdit() {
        if (editStack.isEmpty()) return null;
        return editStack.pop();
    }
}
