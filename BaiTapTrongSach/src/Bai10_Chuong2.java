import java.util.Scanner;

public class Bai10_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hcn: ");
        double cd = sc.nextDouble();
        System.out.print("Nhap chieu rong hcn: ");
        double cr = sc.nextDouble();
        System.out.println("Chu vi hcn la: " + ((cd + cr) * 2));
        System.out.println("Dien tich hcn la: + " + (cd * cr));
    }
}
