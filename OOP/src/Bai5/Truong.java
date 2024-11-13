package Bai5;

import java.util.Scanner;

public class Truong {
	public String ten;
	public String diaChi;
	public String hieuTruong;

public Truong() {
	
}

public Truong(String ten, String diaChi, String hieuTruong) {
	super();
	this.ten = ten;
	this.diaChi = diaChi;
	this.hieuTruong = hieuTruong;
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

public String getHieuTruong() {
	return hieuTruong;
}

public void setHieuTruong(String hieuTruong) {
	this.hieuTruong = hieuTruong;
}

@Override
public String toString() {
	return "Truong [ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
}

public boolean input(Scanner sc) {
	try {
		System.out.print("Nhap ten truong: ");
		this.ten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		this.diaChi = sc.nextLine();
		System.out.print("Nhap ten hieu truong: ");
		this.hieuTruong = sc.nextLine();
	}catch(Exception e) {
		System.out.print("Error " + e);
		System.out.print("Nhap lai: ");
		return false;
	}
	return true;
	}
}
