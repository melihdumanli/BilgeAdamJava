package com.bilgeadam.melih.control;

import java.util.Scanner;

public class Password_Repassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Şifrenizi Giriniz:");
		final String password = scanner.nextLine();
		System.out.println("Lütfen Şifrenizi Tekrar Giriniz:");
		final String repassword = scanner.nextLine();
		
		//String passcheck = password;
		//String repasscheck = repassword;
		
		if (password.contentEquals(repassword))
			System.out.println("Giriş Başarılı");
			
		scanner.close();

	}

}
