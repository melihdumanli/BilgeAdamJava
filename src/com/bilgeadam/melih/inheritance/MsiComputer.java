package com.bilgeadam.melih.inheritance;
// özellikler
// parametresiz constructor
// parametreli constructor
// toString
// method
// getter and setter

// this
// super
// MsiComputer ait özellikler

public class MsiComputer extends Computer{
    // özellikler
    private String msiSensor;
    //***********************************************************/
    // this kullanım alanları
    // 1-) Global değişkenleri çağırmak
    // 2-) Constructorları çağırmak
    //***********************************************************/
    //parametresiz constructor
    public MsiComputer() {
        super();
    }
    // parametreli constructor
    public MsiComputer(String computerName, String computerSerialNumber, String computerMainCart, String msiSensor) {
        //üst atadaki bilgileri almak için kullandığımız bilgiler
        super(computerName, computerSerialNumber, computerMainCart);
        // global değişkenlere erişim
        this.msiSensor = msiSensor;
    }
        // toString
    @Override
	public String toString() {
		return "MsiComputer [msiSensor=" + msiSensor + ", toString()=" + super.toString() + ", getComputerName()="
				+ getComputerName() + ", getComputerSerialNumber()=" + getComputerSerialNumber()
				+ ", getComputerMainCart()=" + getComputerMainCart() + "]";
	}




	// Shift+Alt+S
    @Override
    public void deneme() {
        super.deneme();
        System.out.println("Msi computer");
    }
}
