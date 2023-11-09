package $21$22BackTracking;

//TC->O(n*2^n)
//SC->O(n)
public class FindSubsets {
	private static void findSubsets(String str, String ans, int i) {
		// TODO Auto-generated method stub
		// base case
		if (i == str.length()) {
			if (ans.length() == 0) {
				System.out.println("null");
			} else {
				System.out.println(ans);
			}
			return;
		}
		// recursion
		// Yes Choice
		findSubsets(str, ans + str.charAt(i), i + 1);
		// No Choice
		findSubsets(str, ans, i + 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		findSubsets(str, "", 0);

	}

}
