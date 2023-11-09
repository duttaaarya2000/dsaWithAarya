package $11Function_Methods;

public class FunctionOverloading {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static float add(float a,float b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(9, 6));
		System.out.println(add(5,8,3));
		System.out.println(add(3.5f,9.7f,2));

	}

}
