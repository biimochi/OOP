package Bai2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		DiaChi[]a = new DiaChi[n];
		for(int i = 0; i < n; i++) {
			int k = i + 1;
			System.out.println("Nhap phan tu thu: " + k);
			a[i] = new DiaChi();
			if(!a[i].input(sc)) {
				i--;
			}
		}
		for(DiaChi o : a) {
			System.out.print(o);
		}
		}
	
}
