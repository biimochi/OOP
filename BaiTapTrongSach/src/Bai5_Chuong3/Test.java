package Bai5_Chuong3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        SinhVien[] a = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            int k = i + 1;
            System.out.print("Nhap phan tu thu " + k + ": ");
            a[i] = new SinhVien();
            if (!a[i].input(sc)) {
                i--;
            }
            for (SinhVien o : a) {
                System.out.println(o);
            }
        }
    }


}
