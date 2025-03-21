package generic;

import java.util.ArrayList;
import java.util.List;

/*
* Wrapper Class
* int -> Integer
* String
* float -> Float
* double --> Double
* boolean --> Boolean
* char --> Character
* */
public class GenericDemo {
    public static void main(String[] args) {
        //Class Genneric
        System.out.println("DEMO CLASS GENERIC");
        ClassGeneric<String,String> objStudent = new ClassGeneric<>("SV001", "Nguyễn Văn A");
        System.out.println("Thông tin sinh viên: " + objStudent.toString());
        //Method Generic
        System.out.println("DEMO METHOD GENERIC");
        String[] arrString = {"Nguyễn Văn A","Nguyễn Văn B"};
        Integer[] arrInteger = {1,2,3};
        System.out.println("Thông tin mảng String: ");
        MethodGeneric.printArray(arrString);
        System.out.println("Thông tin mảng Integer: ");
        MethodGeneric.printArray(arrInteger);
        List<String> listString = List.of("Hello","World");
        System.out.println("Danh sách chuỗi: ");
        printData(listString);
    }

    public static void printData(List<?> ListData){
        //?: là bất cứ kiểu dữ liệu nào
        for (Object data : ListData) {
            System.out.println(data);
        }
    }

    public static void printDataUpperBound(List<? extends Tearch> ListData){
        //? extends Tearch: đại diện cho các kiểu dữ liệu kế thừa từ Tearch hoặc Tearch

    }
}
