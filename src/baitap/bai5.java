package baitap;

import java.util.ArrayList;

public class bai5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            if (numbers.indexOf(numbers.get(i)) == i) {
                for(int j = 0; j < numbers.size(); j++) {
                    if (numbers.get(i) == numbers.get(j)) {
                        count++;
                    }
                }
                System.out.println(numbers.get(i) + " - " + count + " lần");
            }
        }
    }
}
