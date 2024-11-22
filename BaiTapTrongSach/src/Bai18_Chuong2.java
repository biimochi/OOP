import java.util.Scanner;

public class Bai18_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if(sont(n))
            System.out.println(n + " la so nguyen to.");
        else
            System.out.println(n + " khong phai la so nguyen to.");
    }

    public static boolean sont(int n){
        if(n <= 1)
           return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
