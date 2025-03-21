package baitap;

import java.util.ArrayList;
import java.util.Collection;

public class bai4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int sum = 0;

        for (Integer i : numbers) {
            sum += i;
        }
        System.out.println(numbers);
        System.out.println("Tổng các phần tử: " + sum);

    }
}
