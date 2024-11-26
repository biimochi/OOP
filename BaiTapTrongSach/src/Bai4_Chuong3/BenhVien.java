package Bai4_Chuong3;

import java.util.Scanner;

public class BenhVien {
    public String ten;
    public String diaChi;
    public String giamDoc;

    public BenhVien(){

    }

    public BenhVien(String ten, String diaChi, String giamDoc) {
        super();
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    @Override
    public String toString() {
        return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
    }

    public boolean input(Scanner sc) {
        try {
            System.out.print("Nhap ten: ");
            this.ten = sc.nextLine();
            System.out.print("Nhap dia chi: ");
            this.diaChi = sc.nextLine();
            System.out.print("Nhap ten giam doc: ");
            this.giamDoc = sc.nextLine();
        }catch(Exception e) {
            System.out.print("Error " + e);
            System.out.print("Nhap lai: ");
            return false;
        }
        return true;
    }
}