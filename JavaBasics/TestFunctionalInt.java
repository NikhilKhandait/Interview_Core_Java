package practical_JavaBasics;

public class TestFunctionalInt implements FunctionalInt {
	@Override
	public int doStuff(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {
		TestFunctionalInt f = new TestFunctionalInt();

		int a = 4;
		int b = 3;

		/*
		 * f.add(a, b);//call default 
		 * FunctionalInt.sub(a, b);//call static
		 */
		System.out.println(f.doStuff(a, b));

	}

}
