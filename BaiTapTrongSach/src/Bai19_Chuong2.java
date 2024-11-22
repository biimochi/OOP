import java.util.Scanner;

public class Bai19_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so gio: ");
        int gio  = sc.nextInt();
        System.out.print("Nhap so phut: ");
        int phut = sc.nextInt();
        System.out.print("Nhap so giay: ");
        int giay = sc.nextInt();
        int tong = gio * 3600 + phut * 60 + giay;
        System.out.println("Tong so giay la: " + tong);
    }
}
