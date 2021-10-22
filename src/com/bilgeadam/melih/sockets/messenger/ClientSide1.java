package com.bilgeadam.melih.sockets.messenger;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientSide1 {

    public static void main(String[] args) {
        clientStart();
    }

    private static void clientStart() {
        String recievedMessage;
        String sentMessage;
        try (Socket socket = new Socket("localhost", StaticPort.PORT1)) {

            BufferedReader brSystemIn = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);
            InputStream inputStream = socket.getInputStream();
            BufferedReader brInputStream = new BufferedReader(new InputStreamReader(inputStream));

            for (int i = 0; i < 2; i++) {
                if ((recievedMessage = brInputStream.readLine()) != null) {
                    System.out.println(recievedMessage);
                }
                sentMessage = brSystemIn.readLine();
                printWriter.println(sentMessage);
            }
            System.out.println(brInputStream.readLine());
            System.out.println(brInputStream.readLine());
            System.out.println(brInputStream.readLine());

            while (true) {
                printWriter.println(brSystemIn.readLine());
                printWriter.flush();

                if ((recievedMessage = brInputStream.readLine()) != null) {
                    System.out.println(recievedMessage);
                }
                WriteToFile write = new WriteToFile();
                write.writeText(recievedMessage);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
