package geekforgeek.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingInt {

	public static void main(String[] args) {
		int[] input = {1,6,2,3,4,3,7,10};
		int repeatingInt = findFirstRepeatingInteger(input);

		for(Integer i: input) 
			System.out.print(i + "\t");
		
		if(repeatingInt != -1) 
			System.out.println(" \nFirst Repeating Integer is --> " + repeatingInt);
		else 
			System.out.println(" \nFound NO Repeating Integer !!");	
	}

	// Method 1: Run 2 loops & check for repeating. Complexity is O(n*n)
	// Method 2: Sort the array in O(nLog n) time & then search using binary search for repeating element.
	// Method 3: Given below. Its the most optimized. Complexity is O(n)
	
	private static int findFirstRepeatingInteger(int[] input) {
		Set<Integer> hashSet = new HashSet<Integer>();
		int min = -1;
		
		// Traverse the array from R to L
		for(int i = input.length - 1 ; i>=0;i--) {
			if(hashSet.contains(input[i])) 
				min = i;
			else 
				hashSet.add(input[i]);
		}
		return (min != -1) ? input[min] : -1 ;
	}
}
