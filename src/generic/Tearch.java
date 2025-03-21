package generic;

public class Tearch extends Person {
    String subject;

    public Tearch(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String toString() {
        return super.toString() + "Subject: " + subject;
    }
}
