package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class File {
	
	private static Map<Character, Integer> histogram = new HashMap<Character, Integer>();

	public static void main(String[] args) throws IOException {
		readFile("/Users/agarwala/Desktop/Personal Work/SolveProblems/src/io/SampleFile.txt");	
		for(Map.Entry<Character, Integer> entry : histogram.entrySet()) {
			System.out.println(" key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}
	
	public static void readFile(String file) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		Character key;
		while((line = reader.readLine()) != null) {
			for(int  i = 0; i< line.length() ; i++) {
				key = Character.toLowerCase(line.charAt(i));
				if(histogram.containsKey(key)) {
					histogram.put(key, histogram.get(key) + 1);
				} else {
					histogram.put(key, 1);
				}
			}
		}
		reader.close();
	}

}
