package com.bilgeadam.melih.sockets.hw20211020;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.*;
import java.net.Socket;
import java.util.Base64;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) {
        BAUtils.header("HOŞGELDİNİZ");
        PortAndIpClass portAndIp = new PortAndIpClass(4711, "localhost");
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket(portAndIp.getIp(), portAndIp.getPort())) {
            InputStream input = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(reader);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            while (true) {
                System.out.println(br.readLine());
                writer.println(scanner.next());
            }

        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
            System.exit(-3);
        }
    }

}
