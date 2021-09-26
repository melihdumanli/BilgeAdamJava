package com.bilgeadam.methods;

import java.util.Scanner;

public class Kullanıcı_Sayi_Girişi {

	public static void result() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int number = scanner.nextInt();
		for (int i = 0; i <= number ; i++) {
			System.out.println(i);
		}
		scanner.close();
		
	}
	public static void main(String[] args) {		
		result();
	}
	
}
