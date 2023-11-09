package $17Bit_Manupulation;

public class UpperToLowerCase {
	public static void main(String args[])
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println((char)(ch|' '));
		}
	}

}
