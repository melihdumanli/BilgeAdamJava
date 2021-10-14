package com.bilgeadam.melih.timedate.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIds {
    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }

        ZoneId zone = ZoneId.of("Turkey");
        ZonedDateTime dt = ZonedDateTime.of(LocalDateTime.of(2021,10,11,9,43), ZoneId.of("Turkey"));
        System.out.println(dt);
    }
}
