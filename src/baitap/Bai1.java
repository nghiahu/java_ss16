package baitap;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<String> StudentArray = new ArrayList<>();

        StudentArray.add("Nguyễn Văn A");
        StudentArray.add("Nguyễn Văn B");
        StudentArray.add("Nguyễn Văn C");
        StudentArray.add("Nguyễn Văn D");
        StudentArray.add("Nguyễn Văn E");

        System.out.println("Dùng vòng lặp for");
        for(int i=0; i<StudentArray.size(); i++){
            System.out.println(StudentArray.get(i));
        }
        System.out.println("Dùng vòng lặp for earch");
        for(String student : StudentArray){
            System.out.println(student);
        }
        System.out.println("Dùng Iterator");
        Iterator<String> iterator = StudentArray.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
