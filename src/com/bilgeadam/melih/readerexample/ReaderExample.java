package com.bilgeadam.melih.readerexample;

import java.io.*;

public class ReaderExample {
    public static void main(String[] args) {
        File file = new File("D:\\BA Dersler\\File Test\\mektup.txt");

        if (file.exists()) {
            System.out.println("Mektup Belgesi Zaten Var");
        } else {
            System.out.println("Mektup Belgesi Henüz yok");
        }
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null)
                    break;
                System.out.println(line);
            }
                bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
