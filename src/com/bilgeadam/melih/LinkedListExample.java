package com.bilgeadam.melih;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(1);
		linkedList.add(1.4);
		linkedList.add("Bilge");
		linkedList.add(true);
		
		MyObject myObject = new MyObject();
		myObject.name = "Babür";
		myObject.type = "İnsan";
		myObject.power = 12;
		linkedList.add(myObject);
		
		
		for (Iterator iterator = linkedList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object.toString());
		}

	}

}
