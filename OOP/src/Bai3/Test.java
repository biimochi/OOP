package Bai3;

import java.util.Scanner;

import Bai2.DiaChi;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		NhanVien[]a = new NhanVien[n];
		for(int i = 0; i < n; i++) {
			int k = i + 1;
			System.out.println("Nhap phan tu thu: " + k);
			a[i] = new NhanVien();
			if(!a[i].input(sc)) {
				i--;
			}
		}
		for(NhanVien o : a) {
			System.out.print(o);
		}
		}
	
}