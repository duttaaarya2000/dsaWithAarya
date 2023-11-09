package $13ARRAYS;

public class pass_by_reference {
	public static void update(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = marks[i] + 10;
		}
	}

	public static void main(String args[]) {
		int marks[] = { 12, 13, 14 };
		update(marks);

		// printing the marks
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

	}

}
