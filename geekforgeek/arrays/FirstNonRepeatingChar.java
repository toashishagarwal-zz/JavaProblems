package geekforgeek.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	// Over all Complexity O(2*n) => O(n)
	public static void main(String[] args) {
		final String input = "GeeksForGeeks";
		Map<String, Integer> count = getCountOfAlphabets(input);

		for (Entry<String, Integer> e : count.entrySet()) {
			System.out.println("> key : " + e.getKey());
			System.out.println("> value : " + e.getValue());
		}
		
		String c = getFirstNonRepeating(count, input);
		if(c == null)
			System.out.println("All char are repeating");
		else 
			System.out.println("First Non repeating char is --> " + c.charAt(0));
	}

	// Complexity O(n)
	private static Map<String, Integer> getCountOfAlphabets(final String input) {
		Map<String, Integer> count = new LinkedHashMap<String, Integer>();   // NOTE: LinkedHashMap is best here
		Integer c = 0;
		
		for(int i =0 ; i < input.length() ; i++) {
			c = count.get(input.charAt(i) + "");
			if(c == null) 
				count.put(input.charAt(i) + "" , 1);
			else
				count.put(input.charAt(i) + "", c + 1);
		}
		return count;
	}
	
	// Complexity O(n)
	public static String getFirstNonRepeating(final Map<String, Integer> charCounts, String input) {
		for(Entry<String, Integer> e: charCounts.entrySet()) {
			if(e.getValue() == 1) 
				return e.getKey();
		}
		return null;
	}
}
