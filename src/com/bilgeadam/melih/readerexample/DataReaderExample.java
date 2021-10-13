package com.bilgeadam.melih.readerexample;

import java.io.*;

public class DataReaderExample {
    public static void main(String[] args) {
        File file = new File("D:\\BA Dersler\\File Test\\values.ddd");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            while (dis.available()>0){
                System.out.println(dis.readDouble());
            }
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
