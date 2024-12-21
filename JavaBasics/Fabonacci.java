package practical_JavaBasics;

public class Fabonacci {
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int res = 0;

		for (int i = 0; i <= 5; i++) {
			/* This sout for changing Output.. */
			// System.out.println(a);
			res = a + b;
			a = b;

			b = res;
			 System.out.println(res);
		}
	}
}
