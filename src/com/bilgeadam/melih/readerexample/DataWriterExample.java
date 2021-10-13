package com.bilgeadam.melih.readerexample;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataWriterExample {
    public static void main(String[] args) {
        double[] values = {1.12, 23.45, 643.0, 9843.98};
        File file = new File("D:\\BA Dersler\\File Test\\values.ddd");
        try {
            FileOutputStream        fos = new FileOutputStream(file);
            BufferedOutputStream    bos = new BufferedOutputStream(fos);
            DataOutputStream        dos = new DataOutputStream(bos);

            for (int i = 0; i < values.length; i++) {
                dos.writeDouble(values[i]);
            }
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
