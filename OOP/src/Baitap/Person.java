package Baitap;

import java.util.Scanner;

public class Person {
	public String name;
	public String dob;
	public String pob;
	public char gender;
	public String email;
	public String phone;

//Ham khoi tao khong doi so
public Person() {
	
}
// Ham khoi tao co doi so
public Person(String name, String dob, String pob, char gender, String email, String phone) {
	this.name = name;
	this.dob = dob;
	this.pob = pob;
	this.gender = gender;
	this.email = email;
	this.phone = phone;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDOB() {
	return dob;
}

public void setDOB(String dob) {
	this.dob = dob;
}

public String getPOB() {
	return pob;
}

public void setPOB(String pob) {
	this.pob = pob;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}



@Override
public String toString() {
	return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email
			+ ", phone=" + phone + "]";
}

public boolean input(Scanner sc) {
	try {
	System.out.print("Nhap ten: ");
	this.name = sc.nextLine();
	System.out.print("Nhap ngay sinh: ");
	this.dob = sc.nextLine();
	System.out.print("Nhap noi sinh: ");
	this.pob = sc.nextLine();
	System.out.print("Nhap gioi tinh: ");
	this.gender = sc.nextLine().charAt(0);
	System.out.print("Nhap email: ");
	this.email = sc.nextLine();
	System.out.print("Nhap so dien thoai: ");
	this.phone = sc.nextLine();
	}catch(Exception e) {
		System.out.print("Error " + e);
		System.out.print("Nhap lai: ");
		return false;
	}
	return true;
}
}





