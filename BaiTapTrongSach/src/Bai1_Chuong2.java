public class Bai1_Chuong2 {
    public static void main(String[] args) {
        //a
        int i = 5;
        int j = 6;
        int x;
        x = i++ + ++j;
        System.out.println("x = " + x);

        System.out.println("");
        //b
        int i1 = 10;
        int j1 = 11;
        int x1;
        x1 = --i + j--;
        System.out.println("x1 = " + x1);

        System.out.println("");
        //c
        int i2 = 5;
        int j2 = 2;
        int x2 = i % j;
        float y2 = i / j;
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);

        System.out.println("");
        //d
        int i3 = 5;
        int j3 = 2;
        float x3 = (float) i / j;
        System.out.println("x3 = " + x3);



        System.out.println("");
        //e
        int i4 = 5;
        int j4 = 2;
        float x5 = i4 / (float) j4;

        System.out.println("");
        //f
        int i5 = 5;
        int j5 = 2;
        float x4 = (float) i / (float) j;
        System.out.println("x4 = " + x4);
    }
}
