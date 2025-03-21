package baitap;

import java.util.ArrayList;

public class bai6 {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(1);
        numArray.add(2);
        numArray.add(3);
        numArray.add(2);
        numArray.add(4);
        numArray.add(1);
        numArray.add(5);

        System.out.println("Mảng trước khi xóa");
        System.out.println(numArray);
        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < numArray.size(); i++) {
            if (numArray.indexOf(numArray.get(i)) != i) {
                numArray.remove(i);
            }
        }
        System.out.println(numArray);
    }
}
