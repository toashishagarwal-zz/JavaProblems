package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

/************************************************************************************************
 Given an input string S write a function which returns true if it satisfies S = nT. 
 Basically you have to find if a given string can be represented from a substring by 
 iterating it “n” times. n >= 2

 An example would suffice –

 Function should return true if
1) S = “abab”
2) S = “abcdabcd”
3) S = “zzxzzxzzx”

Function should return false if
1) S = “abac”
2) S = “abcdabbd”

*************************************************************************************************/

public class SubStringProblemAtGoogle {

	public static boolean isMultipleSubString(final String input) {
		char startOfSubstring = input.charAt(0);
		int index = -1, nextIndex = 0;
		String possibleSubString = "";
		boolean result;
		do {
			index = input.indexOf(startOfSubstring, nextIndex);
			nextIndex = input.indexOf(startOfSubstring, index + 1);
			
			if(nextIndex == -1)
				return false;
			
			possibleSubString = input.substring(index, nextIndex);
			System.out.println(" >> possibleSubString --> " + possibleSubString);
			result = check(possibleSubString, input);
			if(result) 
				break;
		} while(index < input.length());
		return result;
	}

	private static boolean check(String subString, String input) {
		int no = input.length() / subString.length();
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i<no; i++) 
			builder.append(subString);
		return (builder.toString().equalsIgnoreCase(input)) ? true : false ;
	}
}
