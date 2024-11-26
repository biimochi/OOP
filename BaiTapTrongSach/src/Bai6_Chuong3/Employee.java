package Bai6_Chuong3;

import java.util.Scanner;

public class Employee extends Person {
    protected String employerName;
    protected String dateHired;

    public Employee(String employerName, String dateHired) {

    }

    public Employee(String name, int age, char gender, String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employerName='" + employerName + '\'' +
                ", dateHired='" + dateHired + '\'' +
                '}';
    }

    public boolean input(Scanner sc){
        try{
            System.out.print("Nhap ten: ");
            this.name = sc.nextLine();
            System.out.print("Nhap he so luong"+ ": ");
            this.dateHired = sc.nextLine();
        }catch(Exception e){
            System.out.print("Error: " + e);
            System.out.print("Nhap lai: ");
            return false;
        }
        return true;
    }
}
