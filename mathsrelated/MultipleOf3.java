package mathsrelated;

public class MultipleOf3 {

	public static boolean ismultiple(int i) {
		int sum = sumOfDigits(i);
		return (sum % 3 == 0) ? true: false;
	}

	private static int sumOfDigits(int i) {
		int number = i;
		int sum = 0;
		for ( ; number > 0 ; number = number / 10) {
			sum += number % 10;
		}
		
		return sum;
	}
	
	
	public static boolean isMultipleMethod2(final int number) {
		String binary = Integer.toBinaryString(number);
		int oddCount = 0, evenCount = 0;
		
		for(int i =0 ; i< binary.length();i++) {
			if( (i+1) % 2 == 0 && binary.charAt(i) == '1') {		// if even index
				evenCount++;
			} else  if ( ( i+1) % 2 != 0 && binary.charAt(i) == '1') {
				oddCount++;
			}
		}
		System.out.println(" > number --> " + number + "\t binary --> " + binary );
		return (evenCount - oddCount) % 3 ==0 ? true : false;
	}
}
