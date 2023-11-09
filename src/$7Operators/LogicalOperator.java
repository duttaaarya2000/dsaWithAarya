package $7Operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LOGICAL AND
		//If both are true then output true otherwise false
		System.out.println("LOGICAL AND");
		System.out.println((3>2)&&(5>0));
		System.out.println((3>2)&&(5<0));
		System.out.println((3<2)&&(5>0));
		System.out.println((3<2)&&(5<0));
		//LOGICAL OR
		//If both are false then output false otherwise true
		System.out.println("LOGICAL OR");
		System.out.println((3>2)||(5>0));
		System.out.println((3>2)||(5<0));
		System.out.println((3<2)||(5>0));
		System.out.println((3<2)||(5<0));
		//LOGICAL NOT
		//true->false and false->true
		System.out.println("LOGICAL NOT");
		System.out.println(!(3>2));
		System.out.println(!(0>5));

	}

}
