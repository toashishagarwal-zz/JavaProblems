package geekforgeek.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingChar {

	// Over all Complexity is O(2*n) => O(n)   for Algo 1
	// Over all Complexity is O(n)  for Algo 2 
	public static void main(String[] args) {
		final String input = "Geeks5Geeks";
		Map<String, Integer> count = getCountOfAlphabets(input);
		
		String c = getFirstNonRepeating(count, input);
		if(c == null)
			System.out.println("All char are repeating");
		else 
			System.out.println("First Non repeating char is --> " + c.charAt(0));
		
		
		System.out.println("*** Using algo 2");
		
		Character letter = findFirstNonRepeatingChar(input);
		if(letter == null)
			System.out.println("All char are repeating");
		else 
			System.out.println("First Non repeating char is --> " + letter);
		
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
	
	// *************************************************************************************
	// Best algorithm: It finds first non repeating char in a single pass hence O(n)
	// But uses additional memory
	// *************************************************************************************
	public static Character findFirstNonRepeatingChar(final String input) {
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonrepeating = new ArrayList<Character>();
		
		for(int i = 0 ;i < input.length(); i++) {
			char letter = input.charAt(i);
			if(repeating.contains(letter))
				continue;
			else {
				if(nonrepeating.contains(letter)) {
					nonrepeating.remove((Character)letter);
					repeating.add(letter);
				} else {
					nonrepeating.add(letter);
				}
			}
		}
		
		return (nonrepeating.isEmpty()) ? null : nonrepeating.get(0);
	} 
	
}
