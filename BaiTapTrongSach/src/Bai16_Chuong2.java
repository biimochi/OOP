import java.util.Scanner;

public class Bai16_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int giaithua = 1;
        for(int i = 1; i <= n; i++){
            giaithua = giaithua * i;
        }
        System.out.println(n + "! = " + giaithua);
    }
}
