import java.util.Scanner;

public class Bai12_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem sinh vien: ");
        int a = sc.nextInt();
        if(90 <= a && a <= 100)
            System.out.println("Xep loai: A");
        else if(80 <= a && a < 90)
            System.out.println("Xep loai: B");
        else if(70 <= a && a < 80)
            System.out.println("Xep loai: C");
        else if(50 <= a && a < 70)
            System.out.println("Xep loai: D");
        else if(a < 50)
            System.out.println("Xep loai: F");
    }
}
