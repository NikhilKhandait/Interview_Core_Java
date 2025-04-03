package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {

		/*
		 * TCP Server.......... Run this server class form CMD and run client form
		 * machine then req/resp is get....
		 */

		// 1. create server soclet obj
		ServerSocket serverSokt = new ServerSocket(2657);

		System.out.println("server started.....");

		Socket clientSokt = null;

		boolean flag = true;

		// 2. listen incoming request
		while (flag) {
			clientSokt = serverSokt.accept();
			talk(clientSokt);

		}
	}

     //talk to client...
	private static void talk(Socket clientSokt) throws IOException {

		// output stream for write data to client
		PrintWriter out = new PrintWriter(clientSokt.getOutputStream(), true);

		// input stream for read data to client socket
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSokt.getInputStream()));

		// read and write to client socket...
		String line = in.readLine();
		while (line != null) {
			System.out.println("Server Received:" + line);
			out.println(line + "..." + line);
			if (line.equals("Bye")) {
				break;
			}
			line = in.readLine();
		}

		// close server socket
		out.close();
		in.close();
		clientSokt.close();
	}
}
