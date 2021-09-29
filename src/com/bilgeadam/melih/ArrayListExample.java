package com.bilgeadam.melih;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add(1.4);
		arrayList.add("Bilge");
		arrayList.add(true);
		
		MyObject myObject = new MyObject();
		myObject.name = "Babür";
		myObject.type = "İnsan";
		myObject.power = 12;
		arrayList.add(myObject);
		
		
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object.toString());
		}

	}

}
