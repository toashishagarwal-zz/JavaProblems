package numbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		generatePrimeNumbersTill(200);
	}
	
	public static void generatePrimeNumbersTill(final int upperLimit) {
		if (upperLimit < 2)
			System.out.println("Sorry No Primes found ");
		
		else if (upperLimit == 2)
			System.out.println(upperLimit);
		
		else { 
			System.out.print("2,");
			for (int i = 3 ;i < upperLimit; i = i + 2) 
				if (isPrime(i)) 
					System.out.print( i + "," );
		}
	}
	
	private static boolean isPrime(final int number) {
		for (int i = 2; i< number/2; i++ ) 
			if ( number % i == 0) 
				return false;
		return true;
	} 
}
