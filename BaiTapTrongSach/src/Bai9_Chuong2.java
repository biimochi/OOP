public class Bai9_Chuong2 {
    public static void main(String[] args) {
        int tong = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                tong = tong + i;
            }
        }
        System.out.println(tong);
    }
}
