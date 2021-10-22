package com.bilgeadam.melih.sockets.messenger;

import java.io.*;
import java.net.Socket;

public class ClientSide2 {
    private static final String PATH = "C:\\bilgeadam\\messenger.txt";

    public static void main(String[] args) {
        clientStart();
    }

    private static void clientStart() {
        String recievedMessage;
        String sentMessage;
        boolean b = true;
        try (Socket socket = new Socket("localhost",StaticPort.PORT2)) {

            BufferedReader brSystemIn = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);
            InputStream inputStream = socket.getInputStream();
            BufferedReader brInputStream = new BufferedReader(new InputStreamReader(inputStream));

            for (int i = 0; i < 2; i++) {
                if((recievedMessage = brInputStream.readLine()) != null){
                    System.out.println(recievedMessage);
                }
                sentMessage = brSystemIn.readLine();
                printWriter.println(sentMessage);
            }
                System.out.println(brInputStream.readLine());
                System.out.println(brInputStream.readLine());


            while (b==true){



            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String writeText(String chat) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            bufferedWriter.write(chat + "\n");
        } catch (IOException e){
            e.printStackTrace();
        }
        return chat;
    }

}
