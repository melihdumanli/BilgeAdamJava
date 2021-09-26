package com.bilgeadam.melih;

import java.util.Scanner;

public class radar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Sürücünün Hızını Giriniz.");
		int speed = scanner.nextInt();
		int fine;
		/*Hız sınırının yüzde 10 ila yüzde 30 aşılmasının cezası 314 TL
		Hız sınırının yüzde 30 ila yüzde 50 aşılmasının cezası 652 TL
		Hız sınırının yüzde 50'nin üzerinde aşılmasının cezası ise 1.340 TL */
		while (speed <=0) {
			System.out.println("Lütfen Sıfırdan Büyük Bir Değer Giriniz.");
			speed = scanner.nextInt();
		}

		if (speed>88 && speed<=104) {
			fine = 314;
			System.out.println("Hız sınırlarını %10 ile %30 arasında aştınız.");
			System.out.println("Cezanız " + fine + " TL'dir. 15 gün içerisinde ödemeniz halinde %15 indirimli ceza tutarınız " + fine*0.85 + " TL olacaktır.");
		}
		else if (speed>105 && speed<=120) {
			fine = 652;
			System.out.println("Hız sınırlarını %30 ile %50 arasında aştınız.");
			System.out.println("Cezanız " + fine + " TL'dir. 15 gün içerisinde ödemeniz halinde %15 indirimli ceza tutarınız " + fine*0.85 + " TL olacaktır.");
		}
		else if (speed>120) {
			fine = 1340;
			System.out.println("Hız sınırlarını %50'den fazla aştınız.");
			System.out.println("Cezanız " + fine + " TL'dir. 15 gün içerisinde ödemeniz halinde %15 indirimli ceza tutarınız " + fine*0.85 + " TL olacaktır.");
		}
		else {
			System.out.println("Hız sınırlarına uyduğunuz için teşekkür ederiz.");
		}
		scanner.close();

	}

}
