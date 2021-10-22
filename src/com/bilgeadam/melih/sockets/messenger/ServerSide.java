package com.bilgeadam.melih.sockets.messenger;


import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
//import java.util.Random;

public class ServerSide {
    public static void main(String[] args) {
        serverStart();

    }

    private static void serverStart() {
        String recievedMessage;
        String sentMessage;
        User user1 = new User(0, "", "");
        User user2 = new User(0, "", "");
        java.util.Random rnd = new java.util.Random();
        user1.setId(rnd.nextInt(1000));
        do {
            user2.setId(rnd.nextInt(1000));
        } while (user1.getId() == user2.getId());
        try (ServerSocket ss = new ServerSocket(StaticPort.PORT1)) {
            Socket socket = ss.accept();
            BufferedReader brSystemIn = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);
            InputStream inputStream = socket.getInputStream();
            BufferedReader brInputStream = new BufferedReader(new InputStreamReader(inputStream));

            printWriter.println("Lütfen Adınızı Giriniz:");
            printWriter.flush();
            if ((recievedMessage = brInputStream.readLine()) != null) {
                user1.setName(recievedMessage);
            }
            printWriter.println("Lütfen Soyadınızı Giriniz:");
            printWriter.flush();
            if ((recievedMessage = brInputStream.readLine()) != null) {
                user1.setSurname(recievedMessage);
            }
            printWriter.println("Sayın " + user1.getName() + " " + user1.getSurname() + ". Messenger'a Hoşgeldiniz. Ben Server. Kullanıcı ID'niz : " + user1.getId());
            printWriter.println("Programdan Çıkmak İstediğinizde Lütfen Sadece ''Exit'' Yazınız.");
            printWriter.println("Lütfen Mesajınızı Yazınız: ");
            printWriter.flush();

            while (true) {
                recievedMessage = brInputStream.readLine();
                if (recievedMessage != null && !recievedMessage.equalsIgnoreCase("Exit"))
                    System.out.println(user1 + " " + recievedMessage);
                else if (recievedMessage.equalsIgnoreCase("Exit")) {
                        printWriter.println("Çıkış Yapılıyor");
                        System.exit(0);
                    }

                sentMessage = user1 + " " + brSystemIn.readLine();
                printWriter.println(sentMessage);
                printWriter.flush();
                WriteToFile write = new WriteToFile();
                write.writeText(user1 + " " + recievedMessage);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
