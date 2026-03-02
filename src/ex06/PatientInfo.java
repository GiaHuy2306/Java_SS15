package ex06;

public class PatientInfo {
    private String id;
    private String name;
    private int age;
    private String gender;

    public PatientInfo(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Tên: " + name +
                " | Tuổi: " + age +
                " | Giới tính: " + gender;
    }
}
