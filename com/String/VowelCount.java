package com.String;

public class VowelCount {

	public static void main(String[] args) {

		String st = "aijokoebubwujias";
		char[] chr = st.toCharArray();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;

			for (int i = 0; i < chr.length; i++) {
				if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u') {
					if (ch == chr[i]) {
						count++;
					}
				}
			}
			if (count > 0) {
				System.out.println(ch + "=" + count);

			}
		}

	}

}
