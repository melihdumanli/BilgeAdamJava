package com.bilgeadam.melih.atm;

import com.bilgeadam.BAUtils.BAUtils;

public class PasswordCheck {
    public static void PasswordCheck(){
        UserInfo userName = new UserInfo();
        userName.setUserName("Melih");
        userName.setPassword("1234");
        int i =0;
            do {
                String uName = BAUtils.readString("Lütfen Kullanıcı Adınızı Giriniz:");
                String uPassword = BAUtils.readString("Lütfen 4 Haneli Şifrenizi Giriniz: ");
                if((uName.equalsIgnoreCase(userName.getUserName())) && uPassword.equalsIgnoreCase(userName.getPassword()))
                    System.out.println("Giriş Başarılı...");
                else{
                    System.out.println("Giriş Başarısız. Lütfen Tekrar Deneyiniz...");
                    i++;}
            }while (i<5);

    }
}
