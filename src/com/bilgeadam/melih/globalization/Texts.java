package com.bilgeadam.melih.globalization;

import java.util.ArrayList;
import java.util.Locale;

public class Texts {
    private Locale locale;
    private ArrayList<String > texts;

    public Texts(String language, String country){
        this.locale = new Locale(language,country);
        this.texts = new ArrayList<>();
    }

    
}
