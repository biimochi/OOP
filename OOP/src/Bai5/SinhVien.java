package Bai5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
	protected String lop;
	protected String nganh;
	protected Truong truong = new Truong();

public SinhVien() {
	
}

public SinhVien(String lop, String nganh, Truong truong) {
	super();
	this.lop = lop;
	this.nganh = nganh;
	this.truong = truong;
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

public Truong getTruong() {
	return truong;
}

public void setTruong(Truong truong) {
	this.truong = truong;
}

@Override
public String toString() {
	return "SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
}

public boolean input(Scanner sc) {
	try {
		System.out.print("Nhap lop: ");
		this.lop = sc.nextLine();
		System.out.print("Nhap nganh: ");
		this.nganh = sc.nextLine();
		System.out.print("Nhap ten truong: ");
		if(!truong.input(sc)) {
			return false;
		}
	}catch(Exception e) {
		System.out.print("Error " + e);
		System.out.print("Nhap lai: ");
		return false;
	}
	return true;
	}
}

