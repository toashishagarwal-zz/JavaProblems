package pythagorean.triplets;

import java.util.Arrays;

public class PythagoreamTriplets {

	public static void main(String[] args) {
		int[] input = {3,5,1,4,6};
		System.out.println(isPythagoreanTriplet(input));
		
		int[] input2 = {10,4,6,12,5};
		System.out.println(isPythagoreanTriplet(input2));
		
		System.out.println(">> Using Method 2");
		System.out.println(isPythagoreanTripletMethod2(input));
		System.out.println(isPythagoreanTripletMethod2(input2));
	}

	// Method 1: Using 3 for-loops
	// Time complexity O(n^3)
	public static boolean isPythagoreanTriplet(final int[] input) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i<input.length ; i++) {
			for(int j=i+1 ;j < input.length ;j++) {
				for(int k = j+1 ;k<input.length ;k++) {
					a = input[i] * input[i];
					b = input[j] * input[j];
					c = input[k] * input[k];
					
					if(a == b + c || b == a+c || c == a+b) 
						return true;
				}
				
			}
		}
		return false;
	}
	
	
	// Method 2: Using 3 for-loops
	// Time complexity O(n^2)
	public static boolean isPythagoreanTripletMethod2(final int[] input) {
		
		// Step 1: Get the squares of the input elements => O(n)
		for (int i = 0; i < input.length ;i++)
			input[i] = input[i]  * input[i] ;
		
		// Step 2: Sort 
		Arrays.sort(input);
		
		// Step 3: Now fix one element one-by-one and find the other two
	    // 		   elements
		for(int i = input.length - 1; i >= 2; i--) {
			int l = 0;
			int r = i -1;
			while( l < r) {
				// Triplet found
				if(input[l] + input[r] == input[i]) 
					return true;
				
				// Else either move 'l' or 'r'
				if (input[l] + input[r] < input[i]) 
					l++ ;
				else 
					r--;
			}
		}
		
		// No triplet found
		return false;
	}
}
