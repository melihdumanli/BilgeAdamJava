package com.bilgeadam.melih;

import java.util.Scanner;

public class celcius_fahrenheit_converter {

	public static void main(String[] args) {
		System.out.println("\n===========Welcome To Celcius Fahtenheit Covnerter===========");
		System.out.println("=============================================================");
		System.out.println("*************************************************************");

		Scanner scanner = new Scanner(System.in);
		boolean isTrue = true;
		do {
			System.out.println(
					"Celcius'tan Fahrenheit'e Çevirmek İçin 1, Fahrenheit'ten Celcius'a Çevirmek İçin 2 Giriniz:");
			int cont = scanner.nextInt();

			// c = ((f - 32) * (5.0 / 9.0));

			if (cont == 1) {
				System.out.println("Lütfen Celcius Cinsinden Sıcaklık Değerini Giriniz:");
				double celcius = scanner.nextDouble();
				double fahrenheit = (celcius * 9) / 5 + 32;
				System.out
						.println("Girmiş olduğunuz sıcaklığın Fahrenheit cinsinden değeri: " + fahrenheit + "'dir.\n");
			} else if (cont == 2) {
				System.out.println("Lütfen Fahrenheit Cinsinden Sıcaklık Değerini Giriniz:");
				double fahrenheit = scanner.nextDouble();
				double celcius = ((fahrenheit - 32) * 5) / 9;
				System.out.println("Girmiş olduğunuz sıcaklığın Celcius cinsinden değeri: " + celcius + "'dir.\n");
			} else {
				System.out.println("Geçersiz bir sayı girdiniz. Lütfen tekrar deneyiniz.");
			}

			System.out.println("Yeni işlem yapmak istiyor musunuz? (E or H)");
			String yesOrNo = scanner.next();

			if (yesOrNo.equalsIgnoreCase("H")) {
				isTrue = false;
			}

		} while (isTrue);
		scanner.close();
	}

}
