package com.bilgeadam.melih.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {


    public static void fileWriterTryNotWithResources() {
        //linux     : root :/
        //windows   : root :\
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String path = "C:\\bilgeadam\\MelihDumanlı.txt";
        try {
            
            fileWriter = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Melih");
            bufferedWriter.write("Dumanlı");
                   
            System.out.println("Dosylar Yazıldı.");
            bufferedWriter.flush();
            

        }catch (Exception e){
            e.printStackTrace();
        }finally {//çok önemli
			try {
				bufferedWriter.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
    //try with resources
    public static void fileWriterTryWithResources() {
    	String path = "C:\\bilgeadam\\MelihDumanlı.txt";
    	try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
    		bufferedWriter.write("Melih");
            bufferedWriter.write("Dumanlı");
            bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static void fileReaderTryWithResources() {
    	String path = "C:\\bilgeadam\\MelihDumanlı.txt";
    	try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
    		
    		String toplamSatir="";
    		String satir = "";
    		
    		while((satir=bufferedReader.readLine()) != null) {
    			toplamSatir = toplamSatir + satir+ "\n";
    		}
    		System.out.println(toplamSatir);
    		
    		bufferedReader.read();
    		bufferedReader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public static void main(String[] args) {
    	//fileWriterTryNotWithResources();
    	
    	fileReaderTryWithResources();
    }
}
