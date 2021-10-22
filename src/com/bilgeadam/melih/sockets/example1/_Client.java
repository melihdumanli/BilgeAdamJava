package com.bilgeadam.melih.sockets.example1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class _Client {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Socket serverSocket;
		DataOutputStream dataOutputStream;
		String number;
		try {
			serverSocket = new Socket("localhost", 7777);
			dataOutputStream = new DataOutputStream(serverSocket.getOutputStream());
			System.out.println("Lütfen bir sayı giriniz");
			number = klavye.nextLine();
			dataOutputStream.writeUTF(number);
			
			// close
			serverSocket.close();
			dataOutputStream.close();
			klavye.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
		
	}
	
}