package practical_JavaBasics;

import java.util.Arrays;

public class Highest5Number {
	public static void main(String[] args) {

		int[] arr = { 12, 32, 43, 2, 5, 65, 7, 87 };

		Arrays.sort(arr);
		for (int i = arr.length - 5; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
