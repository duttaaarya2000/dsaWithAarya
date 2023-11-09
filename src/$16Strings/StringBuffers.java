package $16Strings;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Buffer class was introduced on JAVA 1(1.0)
		//String Buffer is a mutable data type
		//Synchronized
		//thread safe
		//Less Efficient
		StringBuffer sb = new StringBuffer("Hello");
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
