package com.bilgeadam.melih.control;

import java.util.Scanner;

public class wrapper {

	
	public static void main(String[] args) {
	//primitive = ilkel 
	//wrapper class(referans type)
		
		//int sayi1=44;
		//Integer sayi2=null;
		//sayi2=new Integer(4);
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		//Boxing
		Integer x = i;
		System.out.println(x);
		//Unboxing
		Long y = new Long(55);
		long z= y;
		System.out.println(z);

		scanner.close();
	}

}
