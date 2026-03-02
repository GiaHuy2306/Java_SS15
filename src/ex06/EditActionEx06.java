package ex06;

public class EditActionEx06 {
    private String description;
    private String editedBy;
    private String editTime;

    public EditActionEx06(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return editTime + " | " + editedBy + " | " + description;
    }
}
