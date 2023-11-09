package $16Strings;

public class CompareStrings {
	public static void main(String args[]) {
		String str1="Tony";
		String str2="Tony";
		String str3=new String("Tony");
		String str4=str3;
		String str5=new String("Tony");
		//== checks the object location of String
		//.equals checks the value of string
		if(str1==str2)
		{
			System.out.println("Strings obj are equal");
		}
		else
		{
			System.out.println("Strings obj are not equal");
		}
		if(str1==str3)
		{
			System.out.println("Strings obj are equal");
		}
		else
		{
			System.out.println("Strings obj are not equal");
		}
		if(str3==str4)
		{
			System.out.println("Strings obj are equal");
		}
		else
		{
			System.out.println("Strings obj are not equal");
		}
		if(str1.equals(str4))
		{
			System.out.println("Strings value are equal");
		}
		else
		{
			System.out.println("Strings value are not equal");
		}
		if(str3==str5)
		{
			System.out.println("Strings obj are equal");
		}
		else
		{
			System.out.println("Strings obj are not equal");
		}
		if(str3.equals(str5))
		{
			System.out.println("Strings value are equal");
		}
		else
		{
			System.out.println("Strings value are not equal");
		}
	}
}
