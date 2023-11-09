package $11Function_Methods;

public class PrimeOrNot {
	public static boolean CheckPrime(int num) {
		boolean flag = false;
		for (int i = 2; i <= Math.sqrt(num);i++) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		boolean flag = CheckPrime(num);
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

}
