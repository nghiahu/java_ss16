package baitap;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Nhập vào số lượng số nguyên muốn nhập: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Arr[%d] =  ",i);
            arrayList.add(Integer.parseInt(scanner.next()));
        }
        System.out.println("Danh sách đàu vào: ");
        System.out.println(arrayList);

        ArrayList<Integer> primeNum = new ArrayList<>();
        ArrayList<Integer> evenNum = new ArrayList<>();
        ArrayList<Integer> oddNum = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            boolean isPrime = true;
           if(arrayList.get(i) < 2) {
               isPrime = false;
           }
            for (int j = 2; j <= Math.sqrt(arrayList.get(i)); j++) {
                if(arrayList.get(i)%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNum.add(arrayList.get(i));
            }else {
                if(arrayList.get(i) % 2 == 0){
                    evenNum.add(arrayList.get(i));
                }else {
                    oddNum.add(arrayList.get(i));
                }
            }
        }
        System.out.println("Mảng số nguyên tố: ");
        System.out.println(primeNum);
        System.out.println("Mảng số chẵn");
        System.out.println(evenNum);
        System.out.println("Mảng số lẻ ");
        System.out.println(oddNum);
    }
}
