package practical_String;

public class CountAccuranceOfString {

	public static void main(String[] args) {

	/* String ki value ke charecter count krta hai Ex.- Which letter how many times */
		 
		

		String str = "nikhilkumar";

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {

					count++;
				}
			}
			if (count > 0) {
				System.out.println(ch + "=" + count);

			}

		}
	}
}
