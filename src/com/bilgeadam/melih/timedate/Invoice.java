package com.bilgeadam.melih.timedate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Invoice {
    public static void main(String[] args) {
        //LocalDate today = LocalDate.now();
        LocalDate shoppingDay = LocalDate.of(2021,10,17);
        LocalDate invDate = LocalDate.of(shoppingDay.getYear(), shoppingDay.getMonth(),15);

        if(shoppingDay.getDayOfMonth() > 15){
            invDate = invDate.plusMonths(1);
        }

        long daysToInvoice = shoppingDay.until(invDate, ChronoUnit.DAYS);
        System.out.println("Fatura Tarihi : " + invDate);
        System.out.println("Fatura Kesimi İçin Kalan Süre : " + daysToInvoice + " gün.");

    }

}
