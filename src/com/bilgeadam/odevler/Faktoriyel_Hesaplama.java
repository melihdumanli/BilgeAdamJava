package com.bilgeadam.odevler;

import java.util.Scanner;

public class Faktoriyel_Hesaplama {

	public static void main(String[] args) {

		System.out.println("*********************************************");
		System.out.println("*Faktoriyel Hesaplama Programına Hoşgeldiniz*");
		System.out.println("*******************************************\n\n");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Lütfen bir tam sayı giriniz.");
			double num1 = scanner.nextDouble();
			double i = 1, result = 1;
			while (num1 >= i) {
				result = result * i;
				i++;
			}
			System.out.println(num1 + "! in değeri = " + result);

			System.out.println("Çıkmak istiyor musunuz? (Evet için E!)");
			String cont = scanner.next();

			if (cont.equalsIgnoreCase("E")) {
				break;
			}
		} while (true);

		scanner.close();
		System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");

	}

}
