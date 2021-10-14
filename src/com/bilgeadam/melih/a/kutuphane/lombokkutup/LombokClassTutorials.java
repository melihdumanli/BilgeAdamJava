package com.bilgeadam.melih.a.kutuphane.lombokkutup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LombokClassTutorials {
private int id;
private String adi;
private String soyadi;
private int numarasi;
private String memleket;
private String sehir;
private String tarih;

    public static void main(String[] args) {

    }
}
