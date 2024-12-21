package practical_JavaBasics;

public class SecondHighestInArray {
	public static void main(String[] args) {
		int[] num = { 3, 54, 70, 12, 43, 60 };
		int count = 0;
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			if (temp < num[i]) {

				count = temp;

				temp = num[i];
			}
			if (count < num[i] && temp > num[i]) {
				count = num[i];

			}

		}
		System.out.println(count);
	}
}
