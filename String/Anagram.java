package practical_String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		/* This anagram means tow string is same as to point the result */
		
		String a = "Vishal";
		String b = "Lavish";
		
		/* convert into lowercase for same meaning */
		
		String c = a.toLowerCase();
		String d = b.toLowerCase();
		
		/* string se array me convert karna for spacial count */
		
		char[] e = c.toCharArray();
		char[] f = d.toCharArray();
		
		/* sort krna taki assending order se cheak kare */
		
		Arrays.sort(e);
		Arrays.sort(f);
		
		/* Sorted arry ko equals cheak karna */
		
		if (Arrays.equals(e, f)) {
			System.out.println("This is an Anagram");
			
		}else {
			System.out.println("This is not an Anagram");
		}
	}
}
