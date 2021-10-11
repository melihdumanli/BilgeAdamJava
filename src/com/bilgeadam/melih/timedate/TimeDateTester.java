package com.bilgeadam.melih.timedate;

import java.net.Socket;
import java.time.*;

public class TimeDateTester {
    public static void main(String[] args) {
        System.out.println("\nYerel Zaman                    : " + LocalTime.now().toString());
        System.out.println("\nYerel Tarih ve Zaman           : " + LocalDateTime.now());
        System.out.println("\nSaat Dilimli Tarih ve Zaman    : " + ZonedDateTime.now());
        System.out.println("\nOfsetli Zaman                  : " + OffsetTime.now());
        System.out.println("\nOfsetli Tarih ve Zaman         : " + OffsetDateTime.now());
        System.out.println("\nAy ve Gün                      : " + MonthDay.now());
        System.out.println("\nYıl ve Ay                      : " + YearMonth.now());
        System.out.println("\nAnlık                          : " + Instant.now());

        System.out.println("\nYerel Zaman (CET)              : " + LocalTime.now(ZoneId.of("CET")));

        System.out.println();
        LocalDate d = LocalDate.parse("2021-10-11");
        System.out.println(d.toString());

    }
}
