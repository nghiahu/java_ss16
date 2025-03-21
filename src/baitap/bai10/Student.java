package baitap.bai10;

import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private float gpa;

    public Student(String id, String name, float gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public static void printArr(ArrayList<Student> students) {
        System.out.println("Danh sách sinh viên");
        for (Student student : students) {
            System.out.println("Id : " + student.getId() + " Tên : " + student.getName() + " GPA : " + student.getGpa());
        }
    }
    public static void search(ArrayList<Student> students , String search) {
        System.out.println("Các sinh viên có tên: " + search);
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(search.toLowerCase())) {
                System.out.println("Id : " + student.getId() + " Tên : " + student.getName() + " GPA : " + student.getGpa());
            }
        }
    }
    public static String classifyStudent(Student student) {
        if (student.getGpa() >= 8.5) {
            return "Xuất sắc";
        } else if (student.getGpa() >= 7.0) {
            return  "Giỏi";
        }else if (student.getGpa() >= 5.5) {
            return  "Khá";
        }else {
            return "Trung bình / Yếu";
        }
    }
    public static void printClasify(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Id : " + student.getId() + " Tên : " + student.getName() + " GPA : " + student.getGpa() + classifyStudent(student));
        }
    }
}
