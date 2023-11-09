package $6Variable_DataStructure;

public class ExplicitTypeCasting {
	/*
	 * Forceful Narrowing Conversion 
	 * It happens when destination type<source type
	 * byte < short < int < long < float < double
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Converts float to Integer forcefully
		int marks = (int) 12.58f;
		System.out.println(marks);
		// Converts char to Integer(ASCII) forcefully
		int num = (int) 'a';
		System.out.println(num);
	}

}
