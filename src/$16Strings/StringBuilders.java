package $16Strings;

public class StringBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Builder class was introduced on JAVA 5(1.5)
		//String Builder is mutable
		//Not Synchronized
		//Not thread safe
		//More Efficient
		StringBuilder sb = new StringBuilder("Hello");
		String str1 = sb.toString();
		System.out.println(str1);
		// We can convert Wrapper Class Object to String
		// int a=10
		// a.toString() is not possible
		Integer a = 10;
		System.out.println(a.toString());
		// char ch=10
		// ch.toString() is not possible
		Character ch = 'D';
		System.out.println(ch.toString());
		
	}

}
