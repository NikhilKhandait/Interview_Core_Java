package practical_JavaBasics;

public class ArmStrong {

	public static void main(String[] args) {

		int num = 407;
		int res = 0;
		int num2 = num;

		while (num > 0) {

			int r = num % 10;
			res = res + r * r * r;
			num = num / 10;
		}
		if (num2 == res) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
