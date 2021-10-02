package com.bilgeadam.BAUtils;

public class BilgeAdamUtilsTest {

	public static void main(String[] args) {
		BAUtils.header("oldu mu?");
		boolean proceeding = true;
		do {
			String str = BAUtils.readString("L�tfen bir de�er giriniz");
			System.out.println("Okunan de�er: " + str);
			
			int j = BAUtils.readInt("L�tfen bir tam say� giriniz");
			System.out.println("Okunan de�er: " + j);
			
			double d = BAUtils.readDouble("L�tfen bir virg�ll� say� giriniz");
			System.out.println("Okunan de�er: " + d);
			
			int[] inputs = BAUtils.readInt("L�tfen ", "tam say� giriniz", 4);
			
			for (int i = 0; i < inputs.length; i++) {
				System.out.println(i + ". girilen de�er: " + inputs[i]);
			}
			
			proceeding = BAUtils.proceeding("Devam etmek istiyor musunuz? (Evet / Hay�r)", "Hay�r");
		} while (!proceeding);
		
		
		boolean proceed = BAUtils.proceeding("Devam etmek istiyor musunuz) (Evet / Hayır)", "Evet");
		System.out.println("Okunan değer: " + proceed);
		int[] ints = BAUtils.readInt("Lütfen", "adet tam sayı giriniz", 10);
		System.out.println("Okunan değer: " + ints);
		
		BAUtils.footer();

	}

}
