package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/************************************************************************ 
 * Problem Statement:
 * 		Given an integer array of cities find the min number of hops 
 *  	needed to visit all the cities at least once.
 ************************************************************************/

public class Vacation {

	public static void main(String[] args) {
		int[] sample1 = {7,3,7,3,1,3,4,1};
		System.out.println(solution(sample1));
		
		int[] sample2 = {2,3,1,3,4,1};
		System.out.println(solution(sample2));
	}

	// Time Complexity 	: O(n)
	// Space Complexity :	O()
	public static int solution(int[] A) {
		Integer[] obj = new Integer[A.length];
		
		for (int i = 0 ;i < A.length; i++) 
			obj[i] = Integer.valueOf(A[i]);
		
		Set<Integer> set = new HashSet(Arrays.asList(obj));
		
		Map<Integer, Integer> hash = new Hashtable<Integer, Integer>(); 
		
		for (int i =0 ;i< A.length;i++) {	
			hash.put(A[i], i);
			if(hash.keySet().containsAll(set)) {
				break;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(hash.values());
		Collections.sort(list);
		return list.get(list.size() - 1) - list.get(0) + 1; 
    }
}
