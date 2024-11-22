import java.util.Scanner;

public class Bai14_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien tieu thu: ");
        double sodien = sc.nextDouble();
        if(sodien >= 0 && sodien <= 50)
            System.out.println("Tien dien: " + (sodien * 1484));
        else if(sodien >= 51 && sodien <= 100)
            System.out.println("Tien dien: " + (sodien * 1533));
        else if(sodien >= 101 && sodien <= 200)
            System.out.println("Tien dien: " + (sodien * 1786));
        else if(sodien >= 201)
            System.out.println("Tien dien: " + (sodien * 2242));
    }
}
