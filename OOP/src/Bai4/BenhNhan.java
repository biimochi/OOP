package Bai4;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
	private String tienSu;
	private String chanDoan;
	private BenhVien benhVien = new BenhVien();

public BenhNhan() {
	
}

public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien) {
	super();
	this.tienSu = tienSu;
	this.chanDoan = chanDoan;
	this.benhVien = benhVien;
}

public String getTienSu() {
	return tienSu;
}

public void setTienSu(String tienSu) {
	this.tienSu = tienSu;
}

public String getChanDoan() {
	return chanDoan;
}

public void setChanDoan(String chanDoan) {
	this.chanDoan = chanDoan;
}

public BenhVien getBenhVien() {
	return benhVien;
}

public void setBenhVien(BenhVien benhVien) {
	this.benhVien = benhVien;
}

@Override
public String toString() {
	return "BenhNhan [tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
}

public boolean input(Scanner sc) {
	try {
		System.out.print("Nhap tien su: ");
		this.tienSu = sc.nextLine();
		System.out.print("Nhap chan doan: ");
		this.chanDoan = sc.nextLine();
		System.out.print("Nhap benh vien: ");
		if(!benhVien.input(sc)) {
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
