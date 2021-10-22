package com.bilgeadam.marathon20211018;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.IOException;

public class ExitRequest {
    public static void ExitRequest() throws IOException {
        boolean retval = BAUtils.proceeding("Programdan Çıkmak İstediğinize Emin Misini? (Evet/Hayır)", "Hayır");
        if (retval == true)
            MarathonMethods.AllMethods();
        else
            System.out.println("Programı Kullandığınız İçin Teşekkür Ederiz...");
        System.exit(0);
    }
}
