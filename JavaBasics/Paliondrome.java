package practical_JavaBasics;

public class Paliondrome {
	public static void main(String[] args) {

		int num = 12321;
		int num2 = num;
		int res = 0;
		int temp = 0;

		while (num2 > 0) {
			res = num2 % 10;
			temp = temp * 10 + res;
			num2 = num2 / 10;

		}
		if (num == temp) {
			System.out.println(temp + ": This is palindrome");
		} else {
			System.out.println(temp + ": This is not palindrome");
		}

	}
}
