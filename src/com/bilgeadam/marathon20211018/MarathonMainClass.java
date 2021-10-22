package com.bilgeadam.marathon20211018;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.IOException;
import java.util.Scanner;

public class MarathonMainClass {
    public static void main(String[] args) throws IOException {
        BAUtils.header("O K S - OKUL YÖNETİM SİSTEMİ ");
        MarathonMethods.AllMethods();
        //System.out.println(MarathonMethods.LecturingClassAssignment());
    }

}
