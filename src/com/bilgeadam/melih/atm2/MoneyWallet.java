package com.bilgeadam.melih.atm2;

import java.util.Scanner;

public class MoneyWallet extends CommonProperty implements IBankMethods{
    //özellikler
    protected String moneyType; // kağıt para, bozuk para?
    protected String moneyCurrency; // TL, USD, EUR...
    protected double moneyAmount;

    //composition
    protected Bank bank;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public MoneyWallet() {
        this.moneyAmount = 0.0;
    }

    //abstract  : genel herkes için ortak
    //interface : farklı ortak özellikler

    public MoneyWallet(String id, String moneyType, String moneyCurrency, double moneyAmount) {
        super(id);
        this.moneyType = moneyType;
        this.moneyCurrency = moneyCurrency;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "MoneyWallet{" +
                "moneyType='" + moneyType + '\'' +
                ", moneyCurrency='" + moneyCurrency + '\'' +
                ", moneyAmount='" + moneyAmount + '\'' +
                "} " + super.toString();
    }

    public String scannerValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Seçiminizi Yapınız.");
        System.out.println("1-) Bakiye Görüntüleme\n2-)Para Yatırma\n3-)Para Çekme\n4-) EFT Gönder\n5-)Havale Gönder\n6-)Mail Gönder\n7-)Çıkış");
        String chooice = scanner.nextLine();
        return chooice;
    }
    public void allMethod(){
        //composition
        Bank bank = new Bank("Halkbank", "İstanbul", "HB");

        MoneyWallet moneyWallet = new MoneyWallet("45x","kağıt", MoneyCurrency.TL.name(), 25000.0);
        moneyWallet.setBank(bank);

        String key = scannerValue();
        switch (key){
            case "1" : {
                showMoney();
                break;
            }
            case "2" : {
                addMoney(14000.0);
                break;
            }
            case "3" : {
                reduceMoney(1000.0);
                break;
            }
            case "4" : {
                sendEftMoney(100.0);
                break;
            }
            case "5" : {
                sendHavaleMoney(150.0);
                break;
            }
            case "6" : {
                fakeMail("asdfgh@jklmn.com");
                break;
            }
            case "7" : {
                System.out.println("Çıkış Yapılıyor...");
                System.exit(0);
                break;
            }
            default:
                System.out.println("Hatalı Giriş Yaptınız!");
        }

    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public String getMoneyCurrency() {
        return moneyCurrency;
    }

    public void setMoneyCurrency(String moneyCurrency) {
        this.moneyCurrency = moneyCurrency;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public void showMoney() {
        System.out.println("Paranızın Toplam Tutarı : " + this.moneyAmount);

    }

    @Override
    public void addMoney(double money) {
    this.moneyAmount += money;
    }

    @Override
    public void reduceMoney(double money) {
        if (moneyAmount >0){
            this.moneyAmount -=money;
        } else {
            System.out.println("Hesabınızda Yeterli Bakiye Bulunmamaktadır.");
        }

    }

    @Override
    public void sendHavaleMoney(double money) {
        Bank bank = new Bank();
        for (Object temp :bank.bankHavaleSerial) {
            System.out.println(temp);
        }
        System.out.println("Havale Gönderildi...");
        moneyAmount = moneyAmount - money;

    }

    @Override
    public void sendEftMoney(double money) {
        Bank bank = new Bank();
        for (Object temp :bank.bankEftSerial) {
            System.out.println(temp);
        }
        System.out.println("EFT Gönderildi...");
        moneyAmount = moneyAmount - money;
    }

    @Override
    public void fakeMail(String emailAddress) {
        System.out.println("Mailiniz Gönderiliyor.");

    }
}
