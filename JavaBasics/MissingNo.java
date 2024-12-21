package practical_JavaBasics;

public class MissingNo {
	public static void main(String[] args) {

		int[] a = { 2, 4, 0, 7, 1 };
		int[] b = { 0, 4, 6, 9, };

		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println(a[i]);
			}
		}
	}
}
