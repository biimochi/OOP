package Bai6_Chuong3;

import java.util.Scanner;

public class Person {
    public String name;
    public int age;
    public char gender;

    public Person(){

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public boolean input(Scanner sc){
        try{
            System.out.print("Nhap ten: ");
            this.name = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            this.age = sc.nextInt();
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
