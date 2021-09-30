package com.bilgeadam.melih;

import java.util.Scanner;

public class ChessExample {
	
	//Kullanıcı satranç tahtasında bir nokta girecek.
	//Kullanıcının girdiği noktadan AT'ın gidebileceği yerler işaretlenecek.
	//Kullanıcıya çıktı olarak gösterilecek
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen A1 ve H8 aralığında bir değer giriniz : \nÖrn:D4");
		String position = scanner.next();
		char ch1 = position.charAt(0);
		char ch2 = position.charAt(1);
		char pos = Character.toLowerCase(ch1);
		int i;
		while (i>8) {
			while (pos >'i') {
				System.out.println("Lütfen belirtilen aralıkta bir değer giriniz : \nÖrn:D4");
				position = scanner.next();
				ch1 = position.charAt(0);
				ch2 = position.charAt(1);
				pos = Character.toLowerCase(ch1);
				}
		}
		
		
//		System.out.print(" ");
//		for (char c='A'; c<='H'; c++)
//			System.out.print(" " + c);
		
		System.out.println();
		int[][] chessBoard = new int[8]['h'-'a'+1];
		for (int i = 8; i >0 ; i--) {
			for (char c = 'a'; c <= 'h'; c++) {
				System.out.print((char)c + "" + i + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
