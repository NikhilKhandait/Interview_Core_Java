package practical_JavaBasics;

public class RandomNum {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int result = (int) ((Math.random() * 1000) + 999);
			System.out.println("random num :- " + result);
		}
	}
}
