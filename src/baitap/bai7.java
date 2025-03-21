package baitap;

import java.util.ArrayList;

public class bai7 {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        numberArray.add(1);
        numberArray.add(2);
        numberArray.add(3);
        numberArray.add(2);
        numberArray.add(4);
        numberArray.add(1);
        numberArray.add(5);

        System.out.println("Các phần tử suất hiện 1 lần");
        for (int i = 0; i < numberArray.size(); i++) {
            int count = 0;
            if (numberArray.indexOf(numberArray.get(i)) == i) {
                for(int j = 0; j < numberArray.size(); j++) {
                    if (numberArray.get(i) == numberArray.get(j)) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println(numberArray.get(i));
                }
            }
        }
        System.out.println("Các phần tử bị trùng lặp");
        for (int i = 0; i < numberArray.size(); i++) {
            int count = 0;
            if (numberArray.indexOf(numberArray.get(i)) == i) {
                for(int j = 0; j < numberArray.size(); j++) {
                    if (numberArray.get(i) == numberArray.get(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(numberArray.get(i) + " xuất hiện " + count + " lần");
                }
            }
        }
    }
}
