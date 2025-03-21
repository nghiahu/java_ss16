package baitap;

import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);

        System.out.println("Mảng trước khi xóa: ");
        System.out.println(array);

        array.removeIf(num -> num % 3 == 0);

        System.out.println("Mảng sau khi xóa: ");
        System.out.println(array);
    }
}
