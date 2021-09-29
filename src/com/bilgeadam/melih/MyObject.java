package com.bilgeadam.melih;

public class MyObject {

	String name;
	String type;
	int power;
	@Override
	public String toString() {
		return "MyObject [name=" + name + ", type=" + type + ", power=" + power + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
}
