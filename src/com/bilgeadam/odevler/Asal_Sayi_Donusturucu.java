package com.bilgeadam.odevler;

import java.util.Scanner;

public class Asal_Sayi_Donusturucu {

	public static void main(String[] args) {
		System.out.println("**************************************");
		System.out.println("*Asal Sayı Dönüştürücü'ye Hoşgeldiniz*");
		System.out.println("**************************************\n\n");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Lütfen bir tam sayı giriniz:");
			int num1 = scanner.nextInt();
			int i = 2, mod = num1 % i;
			if (num1 <= 1) {
				while (num1 <= 1) {
					System.out.println("Lütfen 1'den büyük bir tam sayı giriniz:");
					num1 = scanner.nextInt();
				}
				while (mod > 0) {
					i++;
					mod = num1 % i;
				}
				if (i == num1)
					System.out.println("Girmiş olduğunuz sayı asal sayıdır");
				else
					System.out.println("Girmiş olduğunuz sayı asal sayı değildir.");
			} else {
				while (mod > 0) {
					i++;
					mod = num1 % i;
				}
				if (i == num1)
					System.out.println("Girmiş olduğunuz sayı asal sayıdır");
				else
					System.out.println("Girmiş olduğunuz sayı asal sayı değildir.");
			}
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
