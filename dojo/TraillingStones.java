package dojo;

import java.util.HashSet;
import java.util.Set;

public class TraillingStones {

	public String getNumbersOnLastStone(int n, int a, int b) {
		int firstStone = 0;
		StringBuilder result = new StringBuilder();
		int combo1 = 0, combo2=0;
		if(n<3 && a==b) {
			combo1 = firstStone + a;
			result.append(combo1);
		} else if(n < 3) {
			combo1 = firstStone + a;
			combo2 = firstStone + b;
			
			result.append(combo1);
			result.append(combo2);
		} else {        // generic case
			Set<Integer> ans = new HashSet<Integer>();
			int i = firstStone;
			for (;i < n ; i = i + a) {
				System.out.println(" i = " + i);
			}
			ans.add(i);
			for(i = firstStone; i< n ; i= i+b) {
				// no op;
			}
			ans.add(i);
			
			System.out.println(">> ans --> " + ans);
		}
		
		return result.toString();
	}
}
