package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {

		              //TCP Client.............
		/* this is client this is runing from here JVM/Machine */
		
		Socket client = new Socket("127.0.0.1", 5643);

		PrintWriter out = new PrintWriter(client.getOutputStream(),true);

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		System.out.println("clinet started....");

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String str = stdin.readLine();

		while (str != null) {
			out.println(str);

			System.out.println("Echo :" + in.readLine());

			if ("Byy".equals(str)) {
				break;
			}

			str = stdin.readLine();
		}
		
		out.close();
		in.close();
		stdin.close();
		client.close();

	}
}
