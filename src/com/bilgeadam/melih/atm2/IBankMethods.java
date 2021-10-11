package com.bilgeadam.melih.atm2;

public interface IBankMethods {
    // 0-) para görüntüle
    public void showMoney();

    // 1-) Para yatıracağız (eğer paramız 0 ise para eklememiz zorlasın)
    public void addMoney(double money);

    // 2-) Para çekeceğim
    public void reduceMoney(double money);

    // 3-) Havale yapacağım (3 tane hesap No ) :
    public void sendHavaleMoney(double money);

    // 4-) EFT yapabileceğim ( 2 tane IBAN NO) : farklı bankalara göndermek
    public void sendEftMoney(double money);

    // 5-) Fake Mail()
    public void fakeMail(String emailAddress);
}
