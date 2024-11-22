

public class Bai17_Chuong2 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++){
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if(a * a + b * b + c * c == i) {
                System.out.println(" Cac so thoa man la: " + i + " ");
            }
        }
    }
}
