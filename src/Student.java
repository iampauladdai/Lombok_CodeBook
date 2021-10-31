import lombok.*;

@Getter
public class Student {
    private String studentName;
    private String major;
    private @Setter Double gpa;

    public Student(String studentName, String major, Double gpa) {
        this.studentName = studentName;
        this.major = major;
        this.gpa = gpa;
    }
}
