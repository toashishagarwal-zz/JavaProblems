package counting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class MostUsedWords {

	private static Map<String, Integer> words = new HashMap<String, Integer>();
	
	public static void main(String[] args) throws IOException {
		readFile("/Users/agarwala/Desktop/Personal Work/SolveProblems/src/counting/SampleInput.txt");
		printMap();
		sortMapByValue();
	}

	private static void sortMapByValue() {
		Set<Entry<String, Integer>> set = words.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ) {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        });
        System.out.println("** After sorting -->");
        for(Map.Entry<String, Integer> map : list) {
			System.out.println(map.getKey() + "\t" + map.getValue());
		}		
	}

	private static void printMap() {
		for(Map.Entry<String, Integer> map : words.entrySet()) {
			System.out.println(map.getKey() + "\t" + map.getValue());
		}
	}

	public static void readFile(final String fileName) throws IOException{
		final BufferedReader reader = new BufferedReader(new FileReader(fileName));
		
		String line = null;
		StringTokenizer tokenizer;
		String key;
		
		while((line = reader.readLine())!=null) {
			tokenizer = new StringTokenizer(line, " .,:");
			while(tokenizer.hasMoreTokens()) {
				key = tokenizer.nextToken();
				if(words.containsKey(key)) 
					words.put(key, words.get(key) + 1);
				else 
					words.put(key, 1);
			}
		}
		reader.close();
	}
}
