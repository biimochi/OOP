package Bai4;

import java.util.Scanner;

public class Nguoi {
	public String ten;
	public int tuoi;
	public char gioiTinh;

public Nguoi() {
		
}

public Nguoi(String ten, int tuoi, char gioiTinh) {
	super();
	this.ten = ten;
	this.tuoi = tuoi;
	this.gioiTinh = gioiTinh;
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
	return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
}

public boolean input(Scanner sc) {
	try {
		System.out.print("Nhap ten: ");
		this.ten = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		this.tuoi = sc.nextInt();
		System.out.print("Nhap gioi tinh: ");
		this.gioiTinh = sc.nextLine().charAt(0);
	}catch(Exception e) {
		System.out.print("Error " + e);
		System.out.print("Nhap lai: ");
		return false;
	}
	return true;
}
}