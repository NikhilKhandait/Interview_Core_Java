package practical_String;

import java.util.Arrays;

public class ExtractIntFromStrArray {

	public static void main(String[] args) {
		
		String[] str = {"indore452001"};
		String res = "";
		
		for(String s : str) {
			for(int i = 0; i < s.length(); i++) {
				if(Character.isDigit(s.charAt(i))) {
					res = res + s.charAt(i);
				}
			}
			
			int arr[] = new int[res.length()];
			for(int j = 0; j < res.length(); j++) {
				arr[j] = Character.getNumericValue(res.charAt(j));
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
