package Bai6_Chuong3;

import java.util.Scanner;

public class PartTimeEmployee {
    protected int hoursPerWeek;

    public  PartTimeEmployee(){

    }

    public PartTimeEmployee(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hoursPerWeek=" + hoursPerWeek +
                '}';
    }

    public boolean input(Scanner sc){
            try{
                System.out.print("Nhap thoi gian lam viec: ");
                this.hoursPerWeek = sc.nextInt();
            }catch(Exception e){
                System.out.print("Error: " + e);
                System.out.print("Nhap lai: ");
                return false;
            }
            return true;
    }
}
