package com.bilgeadam.melih.generics;

public class GenericsClass <T> {

	// Nesne değişkeni (Global Değişken)
	private T name ;
	private String surname;
	// parametresiz constructor
	public GenericsClass() {
		
	}
	// parametreli constructor
	// Global değişkenlere erişmek için
	// Başka constructor ları çağırmak için
	public GenericsClass(T name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	// getter setter
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "GenericsClass [name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	
}
