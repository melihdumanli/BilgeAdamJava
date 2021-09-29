package com.bilgeadam.melih;

import java.util.ArrayList;
import java.util.LinkedList;

public class Intro2Generics {

	public static void main(String[] args) {
		LinkedList<String> strArray = new LinkedList<String>();
		strArray.add("1");
		strArray.add(""+1);
		for (String string : strArray) {
			System.out.println(string);
		}

		ArrayList<MyObject> arrayList = new ArrayList<MyObject>();
		MyObject obj1 = new MyObject();
		obj1.name = "Fiat";
		obj1.type = "Araba";
		obj1.power =100;
		arrayList.add(obj1);
		
		MyObject obj2 = new MyObject();
		obj2.name = "Güvercin";
		obj2.type = "Kuş";
		obj2.power =22;
		
		MyObject obj3 = new MyObject();
		obj3.name = "vapur";
		obj3.type = "Deniz Taşıtı";
		obj3.power =259;
		
		arrayList.add(obj2);
		arrayList.add(obj3);
		
		MyObject obj4 = new MyObject();
		obj4.name = "Java";
		obj4.type = "Programlama Dili";
		obj4.power =1;
		
		arrayList.add(2,obj4);
		
		for (MyObject myObject : arrayList) {
			System.out.println(myObject);
		}
//		for (MyObject myObject : arrayList) {
//			System.out.println(myObject);
//	}
	
	}
	
	

}
