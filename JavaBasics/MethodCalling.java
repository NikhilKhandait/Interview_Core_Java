package practical_JavaBasics;

public class MethodCalling {

	 static int doStuff(int[] a, int b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return i;

			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] a = { 4, 2, 5, 1, 9, 7 };
		int b = 1;

		int c = doStuff(a, b);
		System.out.println(c);

	}
}
