package com.bilgeadam.melih.control;

public class String_Builder_Examples {

	public static void main(String[] args) {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Melih").append("Dumanlı").append("Java SE");
//		
//		String birlestir = builder.toString();
//		System.out.println(birlestir);

		StringBuffer buffer = new StringBuffer();
		buffer.append("Melih").append("Dumanlı").append("Java SE");
		
		String birlestir = buffer.toString();
		System.out.println(birlestir);
	}

}
