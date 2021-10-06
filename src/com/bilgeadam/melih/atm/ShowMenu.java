package com.bilgeadam.melih.atm;

import java.util.List;

public class ShowMenu {

    public static void ShowAccounts(){
        AccountCreator accounts = new AccountCreator();
        String[] accountList = accounts.AccountCreator();

        for (int i = 0; i < accounts.AccountCreator().length; i++) {
            System.out.println((i+1) + ". Hesap Numarası :  " + accountList[i]);
        }
    }
    public static void ShowIbans(){
        AccountCreator accounts = new AccountCreator();
        String[] ibanList = accounts.IbanCreator();

        for (int i = 0; i < accounts.IbanCreator().length; i++) {
            System.out.println((i+1) + ". IBAN Numarası :  " + ibanList[i]);
        }
    }

}
