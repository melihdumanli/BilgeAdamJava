package com.bilgeadam.melih.sockets.hw20211020_2;

import java.util.ArrayList;
import java.util.List;

// Sehir diye bir class�m�z olsun
// id
// �ehirAdi

// clientta �imdki vereceklerimi eklememiz gerekiyor.
/*
 * �stanbul,Ankara,�zmir,Adana,Ad�yaman,Afyonkarahisar,A�r�,Aksaray,Amasya,
 * Antalya,Ardahan,Artvin,Ayd�n,Bal�kesir,Bart�n,Batman,Bayburt,Bilecik,Bing�l,
 * Bitlis,Bolu,Burdur,Bursa,�anakkale,�ank�r�,�orum,Denizli,Diyarbak�r,D�zce,
 * Edirne,Elaz��,Erzincan,Erzurum,Eski�ehir,Gaziantep,Giresun,G�m��hane,Hakkari,
 * Hatay,I�d�r,Isparta,Kahramanmara�,Karab�k,Karaman,Kars,Kastamonu,Kayseri,
 * K�r�kkale,K�rklareli,K�r�ehir,Kilis,Kocaeli,Konya,K�tahya,Malatya,Manisa,
 * Mardin,Mersin,Mu�la,Mu�,Nev�ehir,Ni�de,Ordu,Osmaniye,Rize,Sakarya,Samsun,
 * Siirt,Sinop,Sivas,��rnak,Tekirda�,Tokat,Trabzon,Tunceli,�anl�urfa,U�ak,Van,
 * Yalova,Yozgat,Zonguldak
 */

// StringTokenizer ile virg�lle par�al�yal�m
// para�alanm�� verileri d�ng� i�inde List ekliyelim
public class _Server6_Object2 {
	
	public static void main(String[] args) {
		// List<StudentObject> list = new ArrayList<StudentObject>();
		// list.add(new StudentObject(0, null));
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		list.forEach(System.out::println);
	}
	
}
