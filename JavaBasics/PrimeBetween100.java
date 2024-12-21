package practical_JavaBasics;

public class PrimeBetween100 {
	public static void main(String[] args) {

		int num = 100;

		boolean flag = false;

		for (int i = 0; i <= 100; i++) {
			for (int j = 2; j < num - 1; j++) {
				if (i % j == 0) {
					flag = true;

				}
			}
			if (flag) {
				System.out.println("Prime" + i);
			}
		}
	}
}
