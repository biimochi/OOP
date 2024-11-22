import java.util.Scanner;

public class Bai22_Chuong2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so luong phan tu: ");
            int n = sc.nextInt();
            int a[] = new int[n];

            //Nhap phan tu
            System.out.println("Nhập các phần tử cho mảng: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                a[i] = sc.nextInt();
            }

            // Hiển thị mảng vừa nhập
            System.out.print("Mảng ban đầu: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            //Tong cac phan tu
            int tong = 0;
            for(int i = 0; i < n; i++){
                tong = tong + a[i];
            }
            System.out.println("");
            System.out.print("Tong cac phan tu trong mang la: " + tong);
        }
    }

