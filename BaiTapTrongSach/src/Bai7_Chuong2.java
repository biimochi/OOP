import java.util.Scanner;

public class Bai7_Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap vao 1 ki tu A, S, M, D: ");
        char grade;
        grade = Character.toUpperCase(new Scanner(System.in).nextLine().charAt(0));
        switch (grade){
            case 'A':
                System.out.print("a + b = " + (a + b));
                break;
            case 'S':
                System.out.print("a = b = " + (a - b));
                break;
            case 'M':
                System.out.print("a * b = " + (a * b));
                break;
            case 'D':
                System.out.print("a / b = " + (a / b));
                break;
            default:
                System.out.print("Ki tu khong hop le.");
        }

    }
}
