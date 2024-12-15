package practical_String;

public class StringBufferMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Nikhil");
		StringBuffer sb1 = new StringBuffer("Nikhil");

		/* Expalin append Method */
		sb.append("Khandait");
		System.out.println("appended string = " + sb);

		/* Print the length of the StringBuffer */
		System.out.println("length of sb = " + sb.length());

		/* print the current capacity of string bufer */
		// NOTE:- initial value of string is 16 and + our string than here our value is
		// 22
		System.out.println("Capacity = " + sb.capacity());

		/* Print the charchter pf index 1 */
		System.out.println("character = " + sb.charAt(2));

		/* replace charcater form index 1-5 with abcd */
		System.out.println(sb.replace(1, 4, "abcd"));

		/* reverse a string */
		System.out.println("reverse string = " + sb.reverse());
		
		/* insert a string */
		System.out.println("insert string : " + sb1.insert(6, "khandait"));
	}

}
