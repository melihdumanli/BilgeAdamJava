package com.bilgeadam.melih.atm;

import com.bilgeadam.BAUtils.BAUtils;

public class PasswordCheck {
    public static boolean PasswordCheck(){
        UserInfo userName = new UserInfo();
        boolean b = false, cont = true;
        userName.setUserName("Melih");
        userName.setPassword("1234");
        int i =0;
            do {
                String uName = BAUtils.readString("Lütfen Kullanıcı Adınızı Giriniz:");
                String uPassword = BAUtils.readString("Lütfen 4 Haneli Şifrenizi Giriniz: ");

                    if ((uName.equalsIgnoreCase(userName.getUserName())) && uPassword.equalsIgnoreCase(userName.getPassword())) {
                        System.out.println("Giriş Başarılı...");
                    b = false;
                    cont = true;
                    }
                else{
                    System.out.println("Giriş Başarısız...");
                    i++;
                    b= true;
                }
                if (i==5) {
                    System.out.println("Hesabınız Bloke Edildi.");
                    b = true;
                    cont = false;
                }
            }while (b);
            return cont;
    }
}
