package com.bilgeadam.melih.sockets.twoway;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date {

    public static void main(String[] args) {

        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(date.format(date));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));

    }
}
