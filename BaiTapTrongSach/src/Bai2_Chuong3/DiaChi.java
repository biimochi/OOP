package Bai2_Chuong3;

import java.util.Scanner;

public class DiaChi {
    public String thon;
    public String xa;
    public String huyen;
    public String tinh;

    public DiaChi(){

    }

    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    public String getThon() {
        return thon;
    }

    public String getXa() {
        return xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    @Override
    public String toString() {
        return "DiaChi{" +
                "thon='" + thon + '\'' +
                ", xa='" + xa + '\'' +
                ", huyen='" + huyen + '\'' +
                ", tinh='" + tinh + '\'' +
                '}';
    }

    public boolean input(Scanner sc){
        try {
            System.out.print("Nhap thon: ");
            this.thon = sc.nextLine();
            System.out.print("Nhap xa: ");
            this.xa = sc.nextLine();
            System.out.print("Nhap huyen: ");
            this.huyen = sc.nextLine();
            System.out.print("Nhap tinh: ");
            this.tinh = sc.nextLine();
        }catch (Exception e){
            System.out.print("Error: " + e);
            System.out.print("Nhap lai: ");
            return false;
        }
        return true;
    }
}
