package hackerrank.string;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String reverse = new StringBuilder(input).reverse().toString();
		System.out.println(isFunny(input, reverse));
	}
	
	static String isFunny(String input, String reverse) {
		int inputDiff=0, reverseDiff=0;
		for (int i = 1; i< input.length();i++) {
			inputDiff = input.charAt(i-1) - input.charAt(i);
			reverseDiff = reverse.charAt(i-1) - reverse.charAt(i);
			
			inputDiff = (inputDiff < 0) ? inputDiff * -1 : inputDiff ;
			reverseDiff = (reverseDiff < 0) ? reverseDiff * -1 : reverseDiff ;
			
			if( inputDiff != reverseDiff ) {
				return "Not Funny";
			}
		}
		return "Funny";
	}
}
