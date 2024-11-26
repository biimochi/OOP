package Bai6_Chuong3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        PartTimeEmployee[] a = new PartTimeEmployee[n];
        for (int i = 0; i < n; i++) {
            int k = i + 1;
            System.out.print("Nhap phan tu thu " + k + ": ");
            a[i] = new PartTimeEmployee();
            if (!a[i].input(sc)) {
                i--;
            }
            for (PartTimeEmployee o : a) {
                System.out.println(o);
            }
        }
    }


}
