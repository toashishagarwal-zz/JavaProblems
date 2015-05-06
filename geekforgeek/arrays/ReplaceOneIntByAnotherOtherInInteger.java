package geekforgeek.arrays;

// Replace all 0s with 5s in the given integer number
// Use of arrays to store all digits in not allowed

public class ReplaceOneIntByAnotherOtherInInteger {

	public static void main(String[] args) {
		final int input = 900090;
		System.out.println("Input --> " + input + "\t Output --> " + convert0To5(input));
	}
	
	private static int convert0To5Recursive(final int input){
		// base case to terminate recursion
		if(input == 0 ) return 0;
		
		// Extract the last digit & change it if its 0
		int val = input % 10;
		if(val == 0 )
			val = 5;
		
		return convert0To5Recursive(input / 10) * 10 + val;
	}
	
	public static int convert0To5 (final int input) {
		return (input == 0) ? 5 : convert0To5Recursive(input) ; 
	} 
}
