package com.bilgeadam.melih.sockets.messenger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    private static final String PATH = "C:\\bilgeadam\\messenger.txt";
    public String writeText(String chat) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            bufferedWriter.write(chat + "\n");
        } catch (IOException e){
            e.printStackTrace();
        }
        return chat;
    }
}
