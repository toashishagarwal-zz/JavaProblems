package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		int[] input = {2,3,1,3,4,2};
		Set inputSet = new HashSet();
		inputSet.add(1);
		inputSet.add(2);
		inputSet.add(3);
		inputSet.add(4);

		solution(input, inputSet);
	}
	
	public static void solution(int[] input, Set inputSet){
	   Set set = new HashSet(Arrays.asList(input));
	   if(set.containsAll(inputSet))  
		   System.out.println("Contains All True");
	   else
		   System.out.println("Contains All False");
	}
}
