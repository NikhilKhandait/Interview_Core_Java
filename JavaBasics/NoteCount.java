package practical_JavaBasics;

public class NoteCount {
	public static void main(String[] args) {

		int[] note = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int count = 0;
		int money = 12005;

		for (int i = 0; i < note.length; i++) {
			if (money > 0) {
			count = money / note[i];
			if (count > 0) {
				System.out.println(note[i] + ":" + count);
				money = money % note[i];
			}
		}
	}
}
}