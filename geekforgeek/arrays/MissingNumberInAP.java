package geekforgeek.arrays;

public class MissingNumberInAP {

	public static void main(String[] args) {
		int[] sampleAP = {3,7,15,19};
		
		// Formula to calculate the diff in an AP with example is -
		// E.g. 2,6,8,10
		//	diff = (10 - 2) / 4
		//	diff = 2	
		
		int n = sampleAP.length;
		int diff = (sampleAP[n - 1] - sampleAP[0]) / n;
		
		System.out.println("Missing Number is ---> " + findMissing(sampleAP , 0 , n-1 , diff));
	}
	
	
	// This problem is solved using Binary Search Algo
	// Complexity : O(log n) time
	private static int findMissing(int[] sampleAP, int lo, int hi, int diff) {
		if (hi <= lo) return Integer.MAX_VALUE; 
		
		// find the middle number
		int middle = lo + (hi - lo)/2;
		System.out.println("diff--> " + diff);
		System.out.println("middle--> " + middle);
		
		// If the element just after mid is missing then
		if(sampleAP[middle + 1] - sampleAP[middle] != diff)
			return sampleAP[middle] + diff;
		
		// If the element just before mid is missing then
		if(middle > 0 && sampleAP[middle] - sampleAP[middle - 1] != diff)
			return sampleAP[middle -1] + diff;
		
		// If till the middle the AP is correct, then search in right half
		if (sampleAP[middle] == sampleAP[0] + middle * diff) 
			return findMissing(sampleAP, middle + 1, hi, diff);
		
		return findMissing(sampleAP, lo, middle - 1, diff);
	}

}
