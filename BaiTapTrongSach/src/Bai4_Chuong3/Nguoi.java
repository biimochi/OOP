package Bai4_Chuong3;

import java.util.Scanner;

public class Nguoi {
    public String ten;
    public int tuoi;
    public char gioiTinh;

    public Nguoi(String ten, char gioiTinh, int tuoi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                '}';
    }

    public boolean input(Scanner sc){
        try{
            System.out.print("Nhap ten: ");
            this.ten = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            this.tuoi = sc.nextInt();
            System.out.print("Nhap gioi tinh: ");
            this.gioiTinh = sc.nextLine().charAt(0);
        }catch(Exception e){
            System.out.print("Error: " + e);
            System.out.print("Nhap lai: ");
            return false;
        }
        return true;
    }
}
