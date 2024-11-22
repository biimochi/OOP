import java.util.Scanner;

import static java.lang.Math.pow;

public class Bai11_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();
        System.out.println("Chu vi hinh tron la: " + (2 * r * 3.14));
        System.out.println("Dien tich hinh tron la: " + (pow(r, 2) * 3.14));
    }
}
