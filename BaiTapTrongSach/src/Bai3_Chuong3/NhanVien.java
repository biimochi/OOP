package Bai3_Chuong3;

import java.util.Scanner;

public class NhanVien {
    public String name;
    public DiaChi address = new DiaChi();
    public String dob;
    public char gender;

    public NhanVien() {
        super();
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", dob='" + dob + '\'' +
                ", gender=" + gender +
                '}';
    }

    public boolean input(Scanner sc){
        try{
            System.out.print("Nhap ten: ");
            this.name = sc.nextLine();
            System.out.print("Nhap dia chi: ");
            address.input(sc);
            System.out.print("Nhap ngay sinh: ");
            this.dob = sc.nextLine();
            System.out.print("Nhap gioi tinh: ");
            this.gender = sc.nextLine().charAt(0);
        }catch(Exception e){
            System.out.print("Error: " + e);
            System.out.print("Nhap lai: ");
            return false;
        }
        return true;
    }
}
