import java.util.Scanner;

public class Bai5_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao 1 so thuc: ");
        float b = sc.nextFloat();
        System.out.print("Nhap vao 1 ki tu: ");
        char c = sc.nextLine().charAt(0);
        System.out.print("Nhap vao 1 chuoi ki tu: ");
        String d = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
