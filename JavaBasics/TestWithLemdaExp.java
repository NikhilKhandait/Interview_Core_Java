package practical_JavaBasics;

public class TestWithLemdaExp {
	public static void main(String[] args) {

		FunctionalInt f = (a, b) -> {
			return a * b;

		};

		int a = 9;
		int b = 8;
		f.add(a, b);
		FunctionalInt.sub(a, b);
		System.out.println(f.doStuff(a, b));
	}
}
