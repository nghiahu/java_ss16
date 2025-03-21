package generic;

public class Student extends Tearch {
    float marks;
    public Student(String name, String subject, float marks) {
        super(name, subject);
        this.marks = marks;
    }
    public String toString() {
        return super.toString() + "Marks: " + marks;
    }
}
