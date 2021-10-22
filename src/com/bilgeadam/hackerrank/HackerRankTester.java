package com.bilgeadam.hackerrank;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Currency.getInstance;

public class HackerRankTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;
        Locale localeIn = new Locale("en", "IN");
        Locale localeCh = Locale.CHINA;
        Locale localeFr = Locale.FRANCE;
        double d = scanner.nextDouble();
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getCurrencyInstance(localeIn);
        DecimalFormatSymbols symbol = new DecimalFormatSymbols(localeIn);
        symbol.setCurrencySymbol("Rs.");
        formatter.setDecimalFormatSymbols(symbol);
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(localeUS);
        System.out.println("US: " + usFormat.format(d));
        System.out.println("India: " + formatter.format(d));;
        /*formatter = (DecimalFormat) NumberFormat.getCurrencyInstance(localeCh);
        symbol = new DecimalFormatSymbols(localeCh);
        symbol.setCurrencySymbol("￥");
        formatter.setDecimalFormatSymbols(symbol);*/
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(localeCh);
        System.out.println("China: " + formatter.format(d));
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(localeFr);
        System.out.println("France: " + frFormat.format(d));
    }

}

