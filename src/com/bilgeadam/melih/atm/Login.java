package com.bilgeadam.melih.atm;

import com.bilgeadam.BAUtils.BAUtils;

public class Login {

    protected void Login(){
        String name = BAUtils.readString("Lütfen Kullanıcı Adını Giriniz: ");
        String password = BAUtils.readString("Lütfen Şifrenizi Giriniz: ");

        UserInfo userInfo = new UserInfo();
        if (name.equalsIgnoreCase(userInfo.getUserName()) && password.equalsIgnoreCase(userInfo.getPassword()))
            System.out.println("Giriş Başarılı");
        StringBuilder builder = new StringBuilder();
        builder.append(Math.round(Math.random()*9));

        String iban = "TR";
        iban = iban + builder.toString();
    }

}
