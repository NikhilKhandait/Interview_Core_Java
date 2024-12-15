package practical_String;

public class CountIntFromString {

	public static void main(String[] args) {
		 
		String str = "pin09893";
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				
				count ++;
			}
		}if (count > 0) {
			System.out.println("int num is string is" +"="+count);
		}
	}
}
