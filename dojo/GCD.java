package dojo;

import java.util.ArrayList;
import java.util.List;

public class GCD {

	public static int getGCD(int number1, int number2) {
		List<Integer> results = new ArrayList<Integer>();
		int lower = (number1 > number2) ? number2 : number1;
		for(int i = 2; i <= (lower/2); i++) {
			if(number1 % i == 0 && number2 % i == 0)  {
				results.add(i);
			}
		}
		if(results.isEmpty()) {
			return 1;
		}
		return results.get(results.size() - 1 );
	}

}
