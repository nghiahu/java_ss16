package baitap;

import java.util.ArrayList;
import java.util.Collections;

public class bai8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("banana");
        arrayList.add("apple");
        arrayList.add("pear");
        arrayList.add("kiwi");
        arrayList.add("grapes");
        System.out.println("Mảng trước khi sắp xếp:");
        System.out.println(arrayList);
        arrayList.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(arrayList);
    }
}
