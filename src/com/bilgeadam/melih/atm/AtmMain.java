package com.bilgeadam.melih.atm;

import com.bilgeadam.BAUtils.BAUtils;
import com.bilgeadam.melih.atm.ShowMenu;
import com.bilgeadam.melih.atm.PasswordCheck;

public class AtmMain {
    public static void main(String[] args) {
        BAUtils.header("AT BANK'a Hoşgeldiniz...");
        PasswordCheck.PasswordCheck();

    }
}
