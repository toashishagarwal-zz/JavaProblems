package factorial;

import java.math.BigInteger;

public class LargeNumberFactorial {

	public static void main(String[] args) {
		System.out.println(" fact of 3 ---> " + factorial(3));
		System.out.println(" fact of 5 ---> " + factorial(5));
		System.out.println(" fact of 48 ---> " + factorial(48));
		System.out.println(" fact of 49 ---> " + factorial(49));
		System.out.println(" fact of 50 ---> " + factorial(50));
		System.out.println(" fact of 100 ---> " + factorial(100));
		
		System.out.println(" **** Results using BigInteger  **** ");
		System.out.println(" fact of 3 ---> " + factorialUsingBI(3));
		System.out.println(" fact of 5 ---> " + factorialUsingBI(5));
		System.out.println(" fact of 48 ---> " + factorialUsingBI(48));
		System.out.println(" fact of 49 ---> " + factorialUsingBI(49));
		System.out.println(" fact of 50 ---> " + factorialUsingBI(50));
		System.out.println(" fact of 100 ---> " + factorialUsingBI(100));
	}
	
	public static long factorial(final int number) {
		long result=1;
		for(int i = number; i>1 ; i--) {
			result *= i;
		}
		return result;
	}
	
	// Using BigInt
	public static BigInteger factorialUsingBI(final int number) {
		BigInteger result = new BigInteger("1");
		for(int i = number; i>1 ; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
