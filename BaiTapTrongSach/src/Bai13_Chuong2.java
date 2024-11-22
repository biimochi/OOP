import java.util.Scanner;

public class Bai13_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia ban: ");
        double giaban = sc.nextDouble();
        System.out.print("Nhap % giam gia: ");
        double giamgia = sc.nextDouble();
        double gia = giaban - (giaban * giamgia / 100);
        System.out.println("Gia san pham sau khi giam la: " + gia);
    }
}
