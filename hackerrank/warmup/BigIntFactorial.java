package hackerrank.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntFactorial {

	public static void main(String[] a ) {
		Scanner scanner = new Scanner(System.in);
		BigInteger no = scanner.nextBigInteger();
		System.out.println(factorial(no));
	}

	private static BigInteger factorial(BigInteger no) {
		if(no.compareTo(BigInteger.ONE) <= 0) 
			return BigInteger.ONE;
		else 
			return no.multiply(factorial(no.subtract(BigInteger.ONE)));
	}
}
