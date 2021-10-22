package com.bilgeadam.melih.sockets.hw20211020;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Base64;
import java.util.Scanner;


public class ServerSide {
    public static void main(String[] args) {
        PortAndIpClass serverPort = new PortAndIpClass(4711);
        Person person = null;
        Scanner scanner = new Scanner(System.in);
        try (ServerSocket server = new ServerSocket(serverPort.getPort())) {
            System.out.println("Server sizi <<" + serverPort.getPort() + ">> numaralı porttan dinliyor");
            Socket socket = server.accept();
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.println("Lütfen Adınızı Giriniz :");
            InputStream input = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(reader);
            person.setName(br.readLine());
            System.out.println(person.getName());
            writer.println("Lütfen Soyadınızı Giriniz :");
            person.setSurname(br.readLine());
            writer.println("Lütfen Şifrenizi Giriniz :");
            person.setSurname(jwtEncoder(br.readLine()));

            while (true) {
                System.out.println(br.readLine());
                writer.println(scanner.next());


            }
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
            System.exit(-1);
        }
    }

    private static String decoder(String password) {
        byte[] decodedBytes = Base64.getDecoder().decode(password);
        return new String(decodedBytes);
    }
    private static String jwtEncoder(String password) {
        byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
        return new String(encodedBytes);
    }


}
