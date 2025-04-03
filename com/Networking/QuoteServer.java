package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuoteServer {

	/* UDP Server program..... */

	public static void main(String[] args) throws IOException {

		String[] quotes = { "Bura mat dekho", "Bura mat karo", "Bura mat suno" };

		// start UDP socket @4445-#port
		DatagramSocket socket = new DatagramSocket(5432);

		// create byte buffer
		byte[] buf = new byte[256];

		// create empty data packet
		DatagramPacket packet = new DatagramPacket(buf, buf.length);

		boolean flag = true;

		while (flag) {
			// wait and recive packet
			socket.receive(packet);

			// Get sender ip address
			InetAddress address = packet.getAddress();

			// Get Sender port number
			int port = packet.getPort();

			// get random index number between 0 - 2
			int index = (int) (Math.random() * 2);

			// get random quote
			byte[] quote = quotes[index].getBytes();

			DatagramPacket quotepkt = new DatagramPacket(quote, quote.length,address, port);

			socket.send(quotepkt);
		}

		socket.close();

	}
}
