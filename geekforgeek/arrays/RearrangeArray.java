package geekforgeek.arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		int[] sample1 = {2,0,1,4,5,3};
		int[] result1 = rearrange(sample1);
		printArray(result1);
		
		System.out.println(" \n");
		int[] sample2 = {3, 2, 1, 0};
		int[] result2 = rearrange(sample2);
		printArray(result2);
		
		System.out.println(" \n");
		int[] sample3 = {1, 3, 0, 2};
		int[] result3 = rearrange(sample3);
		printArray(result3);
		
		System.out.println("\n\n***** Result using space optmization ***** ");
		int[] sample4 = {1, 3, 0, 2};
		printArray(rearrangeOptimized(sample4));
	}

	private static void printArray(int[] result) {
		for (Integer i : result) 
			System.out.print(i + " \t");
	}

	// Time Complexity 	: 	O(n)
	// Space Complexity	:	O(n)
	
	private static int[] rearrange(int[] sample1) {
		int[] result = new int[sample1.length];
		int  temp = -1;
		for(int i = 0; i < sample1.length; i++) {
			temp = sample1[i];
			result[temp] = i; 
		}
		return result;
	}
	
	// Time Complexity 	: 	O(n)
	// Space Complexity	:	O(1)
		
	private static int[] rearrangeOptimized(int[] sampleArray) {
		int val = 0; int i = sampleArray[0];
		
		while (i != 0) {
			int new_i = sampleArray[i];
			sampleArray[i] = val;
			
			val = i;
			i = new_i;
		}
		sampleArray[0] = val;
		return sampleArray;
	}
}



