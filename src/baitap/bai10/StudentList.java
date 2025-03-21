package baitap.bai10;

import java.util.ArrayList;
import java.util.Scanner;

import static baitap.bai10.Student.*;

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        do{
            System.out.println("*****************MENU**********************");
            System.out.println("1. In ra danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo tên");
            System.out.println("4. Phân loại sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if(students.isEmpty()){
                        System.out.println("Chưa có sinh viên nào vui lòng thêm sinh viên!");
                    }else {
                        printArr(students);
                    }
                    break;
                case 2:
                    Student student = new Student();
                    System.out.print("Nhập vào Id sinh viên: ");
                    student.setId(scanner.nextLine());
                    System.out.print("Nhập vào tên sinh viên: ");
                    student.setName(scanner.nextLine());
                    System.out.print("Nhập vào điểm trung bình của sinh viên: ");
                    student.setGpa(Float.parseFloat(scanner.nextLine()));
                    students.add(student);
                    break;
                case 3:
                    System.out.print("Nhập vào tên sinh viên cần tìm: ");
                    String nameSrearch = scanner.nextLine();
                    search(students,nameSrearch);
                    break;
                case 4:
                    printClasify(students);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại!");
            }
        }while (true);
    }
}
