package $16Strings;

public class Substring {
	public static String getSubString(String str,int si,int ei)
	{
		String substring="";
		for(int i=si;i<ei;i++)
		{
			substring+=str.charAt(i);
		}
		return substring;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		System.out.println(str.substring(0,5));
		System.out.println(getSubString(str, 0, 5));
	}

}
