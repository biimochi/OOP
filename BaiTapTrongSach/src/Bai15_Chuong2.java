import java.util.Scanner;

public class Bai15_Chuong2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap don gia: ");
        double dongia = sc.nextDouble();
        System.out.print("Nhap so ngay luu tru: ");
        int ngay = sc.nextInt();
        double tien = ngay * dongia;
        if(ngay == 1)
            System.out.println("So tien phai thanh toan la: " + tien);
        else if(ngay >= 2 && ngay <= 4)
            System.out.println("So tien phai thanh toan la: " + tien * 80 / 100);
        else if(ngay >= 5 && ngay <= 10)
            System.out.println("So tien phai thanh toan la: " + tien  *60 / 100);
        else if(ngay >= 11)
            System.out.println("So tien phai thanh toan la: " + tien * 40 / 100);
    }
}
