package com.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {
	public static void main(String[] args) throws IOException {

		URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

		System.out.println("Protocal :" + url.getProtocol());
		System.out.println("Host :" + url.getHost());
		System.out.println("Port :" + url.getPort());
		System.out.println("File :" + url.getFile());

		InputStream istr = url.openStream();

		Scanner sc = new Scanner(istr);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

		sc.close();
	}
}
