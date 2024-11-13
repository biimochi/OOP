package Bai3;

import java.util.Scanner;

public class NhanVien {
	protected String name;
	protected DiaChi address = new DiaChi();
	protected String dob;
	protected char gender;
	
public NhanVien() {
	
}

public NhanVien(String name, DiaChi address, String dob, char gender) {
	super();
	this.name = name;
	this.address = address;
	this.dob = dob;
	this.gender = gender;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public DiaChi getAddress() {
	return address;
}

public void setAddress(DiaChi address) {
	this.address = address;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "NhanVien [name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
}

public boolean input(Scanner sc) {
	try {
		System.out.print("Nhap ten: ");
		this.name = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		address.input(sc);
		System.out.print("Nhap ngay sinh: ");
		this.dob = sc.nextLine();
		System.out.print("gioi tinh: ");
		this.gender = sc.nextLine().charAt(0);
	}catch(Exception e) {
		System.out.print("Error " + e);
		System.out.print("Nhap lai: ");
		return false;
	}
	return true;
	}
}
