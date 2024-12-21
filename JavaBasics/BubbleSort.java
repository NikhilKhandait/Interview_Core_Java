package practical_JavaBasics;

public class BubbleSort {
	public static void main(String[] args) {

		int[] num = { 4, 6, 9, 3, 2, 5 };
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];

					num[i] = num[j];

					num[j] = temp;
				}

			}
			System.out.print(num[i]);
		}

	}
}
