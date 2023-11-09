package $21$22BackTracking;

//TC->O(n*n!)
public class FindPermutations {
	public static void findPermutation(String str, String ans) {
		// base
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		// recursion
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			// "abcde"=>"ab"+"de"="abde"
			String NewStr = str.substring(0, i) + str.substring(i + 1);
			findPermutation(NewStr, ans + curr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		findPermutation(str, "");

	}

}
