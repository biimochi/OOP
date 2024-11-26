package Bai5_Chuong3;

import java.util.Scanner;

public class SinhVien {
    public String lop;
    public String nganh;
    public String truong;


    public SinhVien(){

    }

    public SinhVien(String lop, String truong, String nganh) {
        this.lop = lop;
        this.truong = truong;
        this.nganh = nganh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "lop='" + lop + '\'' +
                ", nganh='" + nganh + '\'' +
                ", truong='" + truong + '\'' +
                '}';
    }

    public boolean input(Scanner sc){
        try{
            System.out.print("Nhap lop: ");
            this.lop = sc.nextLine();
            System.out.print("Nhap nganh: ");
            this.nganh = sc.nextLine();
            System.out.print("Nhap truong: ");
            this.truong = sc.nextLine();
        }catch(Exception e){
            System.out.print("Error: " + e);
            System.out.print("Nhap lai: ");
            return false;
        }
        return true;
    }
}
