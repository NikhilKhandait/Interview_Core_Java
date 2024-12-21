package practical_JavaBasics;

public class FindIndexOfNumberInArray {

	public static void main(String[] args) {
		
		int [] arr = {3,4,6,12,43,22,66,90};
		
		int a = 43;
		int res = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				res = i;
				System.out.println("num is :" + res);
			}
		}
	}
	
}
