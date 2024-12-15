package practical_JavaBasics;

public class ReverseNumber {
	public static void main(String[] args) {

		int a = 5678;
		int result = 0;

		while (a > 0) {

			int r = a % 10;
			result = result * 10 + r;
			a = a / 10;

		}
		System.out.println(result);
	}
}
