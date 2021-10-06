package com.bilgeadam.melih.atm;

import com.bilgeadam.melih.lesson22.Person;

import java.util.ArrayList;
import java.util.List;

public class AccountCreator {
    private String accountNumber;

    public final String[] AccountCreator(){
        StringBuilder builder = new StringBuilder();
        String[] account = new String[3];
        for (int i = 0; i < account.length; i++) {
            for (int j =0; j<16; j++) {
                builder.append(Math.round(Math.random() * 9));
            }
            account[i] = builder.toString();
            builder.setLength(0);
        }
        return account;
    }
    public final String[] IbanCreator(){
        String[] ibans = new String[3];
        String[] accounts = AccountCreator();
        String ibanNumber = "TR";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j =0; j<8; j++){
                builder.append(Math.round(Math.random()*9));
            }
            ibanNumber = ibanNumber+builder.toString()+accounts[i];
            ibans[i] = ibanNumber;
            builder.setLength(0);
            ibanNumber ="TR";
        }

        return ibans;
    }
}
