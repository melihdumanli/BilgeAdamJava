package com.bilgeadam.methods;

public class Methods {
	
	//voidli parametresiz
	public static void voidliParametresiz () {
		System.out.println("Ben Voidli ve Parametresiz metodum.");
	}
	
	public static void voidliParametreli (String adiSoyadi) {
		System.out.println(adiSoyadi);
	}
	
	//voidsiz parametresiz
	public static String voidsizParametresiz() {
		
		return "Kayseri";
	}
	
	public static int voidsizParametreli(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static void main(String[] args) {
		voidliParametresiz();
		voidliParametreli("Melih DUMANLI");
		String adi = voidsizParametresiz();
		System.out.println(adi);
		int toplam = voidsizParametreli(4,6);
		System.out.println(toplam);
	}


}
