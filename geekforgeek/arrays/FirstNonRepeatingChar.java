package geekforgeek.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		final String input = "Geeks4Geeks";
		Map<String, Integer> count = getCountOfAlphabets(input);

		for (Entry<String, Integer> e : count.entrySet()) {
			System.out.println("> key : " + e.getKey());
			System.out.println("> value : " + e.getValue());
		}
		
		int index = getFirstNonRepeating(count, input);
		if(index == -1)
			System.out.println("All char are repeating");
		else 
			System.out.println("First Non repeating char is --> " + input.charAt(index));
	}

	private static Map<String, Integer> getCountOfAlphabets(final String input) {
		Map<String, Integer> count = new HashMap<String, Integer>();
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
	
	public static int getFirstNonRepeating(final Map<String, Integer> charCounts, String input) {
		List<Integer> list = new ArrayList<Integer>();
		for(Entry<String, Integer> e: charCounts.entrySet()) {
			if(e.getValue() == 1) 
				list.add(input.indexOf(e.getKey()));
		}
		Collections.sort(list);
		return (list.isEmpty()) ? -1 : list.get(0);
	}
}
