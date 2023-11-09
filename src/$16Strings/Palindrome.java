package $16Strings;

public class Palindrome {
	public static boolean checkPalindrome(String str)
	{
		int n=str.length();
		for(int i=0;i<=n/2;i++)
		{
			if(str.charAt(i)!=str.charAt(n-1-i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="racecar";
		System.out.println(str+"is a Palindrome? "+checkPalindrome(str));
		

	}

}
