package Bai4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 5;
	BenhNhan[]a = new BenhNhan[n];
	for(int i = 0; i < n; i++) {
		int k = i + 1;
		System.out.println("Nhap phan tu thu: " + k);
		a[i] = new BenhNhan();
		if(!a[i].input(sc)) {
			i--;
		}
	}
	for(BenhNhan o : a) {
		System.out.print(o);
	}
	}
	
}