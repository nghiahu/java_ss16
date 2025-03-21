package baitap;

import java.util.ArrayList;
import java.util.Collections;

public class bai3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(4);
        array.add(5);
        array.add(3);
        array.add(2);

        int max = Collections.max(array);
        int min = Collections.min(array);

        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);
    };
}
