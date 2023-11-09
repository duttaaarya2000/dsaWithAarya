package $19Recursion;

//Print all binary strings of size N without consecutive ones
public class BinaryStringProblem {
	public static void printBinString(int n, int lastPlace, String str) {
		//base
		if(n==0)
		{
			System.out.println(str);
			return;
		}
		//kaam
		if(lastPlace==0)
		{
			//sit on chair n
			printBinString(n-1,0,str+"0");
			printBinString(n-1,1, str+"1");
		}
		else
		{
			printBinString(n-1,0, str+"0");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBinString(5, 0, "");
	}

}
