package $19Recursion;

public class LengthOfString {
	public static int findLength(String str) {
		if (str.equals("")) {
			return 0;
		} else {
			return findLength(str.substring(1)) + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdef";
		System.out.println(findLength(str));

	}

}
