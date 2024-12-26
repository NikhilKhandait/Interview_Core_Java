package practical_JavaBasics;

@FunctionalInterface
public interface FunctionalInt {

	public int doStuff(int a, int b);

	public static void sub(int a, int b) {
		System.out.println("sub" + (a - b));
	}

	public default void add(int a, int b) {
		System.out.println("add" + (a + b));
	}

}
