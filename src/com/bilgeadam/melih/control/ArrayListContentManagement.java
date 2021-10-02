package com.bilgeadam.melih.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListContentManagement {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList(100);
		
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			arrayList.add(rnd.nextInt(150));
		}
		
		System.out.println(arrayList.get(63));
		arrayList.set(63, "Melih");
		System.out.println(arrayList.get(63));
		System.out.println(arrayList.get(64));
		System.out.println(arrayList.size());
		
		arrayList.remove(63);
		System.out.println(arrayList.get(63));
		System.out.println(arrayList.size() + "\n");
		
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
		
//		for (Object object : arrayList) {
//			System.out.println(object);
//		}
		
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

	}

}
