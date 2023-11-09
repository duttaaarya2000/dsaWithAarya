package $16Strings;

public class CharInString {
	public static void printchar(String str) {
		for(int i=0;i<str.length();i++)
		{
			//prints character at index i
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "!@#$%^&*()1234567asdRTghh";
		printchar(str);

	}

}
