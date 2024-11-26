package Bai7_Chuong3;

public class ResizeableCircle extends Circle implements Resizeable{
    public ResizeableCircle(){
        super();
    }

    public ResizeableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= (1 + percent/100);
    }
}
