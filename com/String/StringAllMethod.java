package com.String;

public class StringAllMethod {

	public static void main(String[] args) {

		String st = "nikhil khandait";

		String st2 = "NIKHIL kumar";

		/* print length of string */
		System.out.println("length is = " + st.length());

		/* print character of index no.9 */
		System.out.println("index is = " + st.charAt(9));

		/* indexOf means no of index per konsi string h */
		System.out.println("String index of a = " + st.indexOf("i"));

		/* replace any later with our choise Ex.- k to n */
		System.out.println("Replace k wit n = " + st.replace("k", "n"));

		/* change lowercase to UPERCASE for a String */
		System.out.println("lowercase = " + st2.toLowerCase());

		/* change UPERCASE to lowercase for a String */
		System.out.println("UPERCASE = " + st2.toUpperCase());

		/*
		 * cheak if string stratWith Ex.- N / Rembar that its return boolean value like
		 * T/F
		 */
		System.out.println("string start with = " + st.startsWith("n"));

		/*
		 * cheak if string endWith Ex.- l / Remambar that its return boolean value like
		 * T/F
		 */

		System.out.println("String end with = " + st.endsWith("l"));

		/* print substring means remove character after and before the instruction */
		System.out.println("Substring of = " + st.substring(7));

		/* concate a tow string means conect to value in a string */
		System.out.println("concate of a string is = " + st.concat(st2));

		/* trim a space for in string */
		System.out.println("trimmed string is: " + st2.trim());

		/*
		 * String[] s = st2.split(""); for(String a : s) { System.out.print("split:" + a
		 * );
		 */

		/* one other exapme of sub string 2 parameter */
		System.out.println(st.substring(2, 7));
	}

}
