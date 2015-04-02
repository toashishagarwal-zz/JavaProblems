package geekforgeek.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckMissingDuplicateWithinK {

	public static void main(String[] args) {
		// int[] inputArray = {3,4,5,3,6,1,6,2};
		// int k = 3;
		int[] inputArray = {4,5,2,1,3,4,3,2,7};
		int k = 4;
		if(checkDuplicate(inputArray, k)) 
			System.out.println("Got Duplicate");
		else 
			System.out.println("Oops ! No Duplicate found");
	}

	// Complexity : O(n)
	private static boolean checkDuplicate(int[] inputArray, int k) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < inputArray.length ; i++) {
			// If already there then we have found the duplicate
			if(set.contains(inputArray[i])) return true;
		
			// else Add this element to hashset
			set.add(inputArray[i]);
			
			// Remove the element at location j such that j >= (i+k)
			if(i >= k)
				set.remove(inputArray[i-k]);
		}
		return false;
	}

}
