package $6Variable_DataStructure;

/*Type Promotion in Expressions
1.Java automatically promotes each byte,short,or char operand to int when evaluating an expression
2.If One operand is long,float or double the whole expression is promoted to long,float or double respectively*/
public class TypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='a';
		char b='b';
		//char c=b-a;(We need to use Explicit type conversion)
		int c=b-a;
		System.out.println(c);
		short x=5;
		byte y=25;
		char z='c';
		//short sh=x+y+z;(We need to use Explicit type conversion)
		int bt=x+y+z;
		System.out.println(bt);
		int i=10;
		long j=25;
		float k=20.25f;
		double l=30;
		double m=i+j+k+l;
		float n=i+j+k;
		long o=i+j;
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println("n="+n);
		System.out.println("o="+o);
	}

}
