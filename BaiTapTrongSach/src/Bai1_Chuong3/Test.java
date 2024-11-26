package Bai1_Chuong3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Person[]a = new Person[n];
        for(int i = 0; i < n; i++) {
            int k = i + 1;
            System.out.println("Nhap phan tu thu: " + k);
            a[i] = new Person();
            if(!a[i].input(sc)) {
                i--;
            }
        }
        for(Person o : a) {
            System.out.print(o);
        }
    }
}
