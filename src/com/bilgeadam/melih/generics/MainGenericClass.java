package com.bilgeadam.melih.generics;

public class MainGenericClass {

	public static void main(String[] args) {
		GenericsClass genericsClass = new GenericsClass(44, "Dumanlı");
//		genericsClass.setName("Melih");
//		genericsClass.setSurname("Dumanlı");
		System.out.println(genericsClass);
//		
//		System.out.println(genericsClass.getName() +" " +  genericsClass.getSurname());
	}

}
