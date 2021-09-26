package com.bilgeadam.melih;

import java.util.Scanner;

public class Calculation_Tool {

	public static void main(String[] args) {
		
		result();
		}
	
	public static void result() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Birinci Sayıyı Giriniz:");
		int num1 = scanner.nextInt();
		System.out.println("Lütfen İkinci Sayıyı Giriniz:");
		int num2 = scanner.nextInt();
		System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz.");
		System.out.println(" 1. Toplama \n 2. Çarpma \n 3. Çıkarma \n 4. Bölme \n 5. Kalan");
		
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			int result = num1 + num2;
			System.out.println(result);
			break;
		case 2:
			result = num1 * num2;
			System.out.println(result);
			break;
		case 3:
			result = num1 - num2;
			System.out.println(result);
			break;
		case 4:
			result = num1 / num2;
			System.out.println(result);
			break;
		case 5:
			result = num1%num2;
			System.out.println(result);
			break;
		default:
			System.out.println("Geçersiz Bir Sayı Girdiniz.");
			break;

		}
		scanner.close();
	}
}

