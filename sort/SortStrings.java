package sort;

import java.util.HashMap;
import java.util.Map;

public class SortStrings {

	public static void main(String[] args) {
		String[] input = {"luis", "hector", "selena", "emmanuel", "amish"};
		// String[] input = {"luis","hector","selena","emmanuel","amish","anna","andrea","rawle"};
		Map<String, String> map = new HashMap<String, String>();
		
		for(String s: input ) {
			map.put(s.charAt(0) + "", s);
		}
		
		for(String s : input) {
			findFirstWord(s, map, map.size(), s);
		}
	}

	public static void findFirstWord(String word, Map<String, String> map, int length, String initialWord) {
		if(length  == 0) {
			printResult(initialWord, map);
			return;
		} 
		if (word == null) {
			return;
		}
		String lastAlphabet = word.charAt(word.length() - 1) + "";
		findFirstWord(map.get(lastAlphabet), map, length-1, initialWord);
	}

	private static void printResult(String initialWord, Map<String, String> map) {
		String lastAlphabet = "";
		for(int i = 0 ; i < map.size() ; i++) {
			System.out.println(initialWord);
			lastAlphabet = initialWord.charAt(initialWord.length() - 1) + "";
			initialWord = map.get(lastAlphabet);
		}
		System.out.println("\n");
	}
}
