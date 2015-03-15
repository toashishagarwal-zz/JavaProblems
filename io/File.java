package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class File {
	
	private static Map<Character, Integer> histogram = new TreeMap<Character, Integer>();

	public static void main(String[] args) throws IOException {
		readFile("/Users/agarwala/Desktop/Personal Work/SolveProblems/src/io/SampleFile.txt");
		
		for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
			for (int i = 0 ; i < entry.getValue() ; i++) {
				System.out.print("*");
			}
			System.out.println(entry.getKey());
		}
	}
	
	public static void readFile(String file) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		Character key;
		while((line = reader.readLine()) != null) {
			for(int  i = 0; i< line.length() ; i++) {
				key = Character.toLowerCase(line.charAt(i));
				if(key.equals(' ')) {
					// do no operation;
				}
				else if(histogram.containsKey(key)) 
					histogram.put(key, histogram.get(key) + 1);
				else 
					histogram.put(key, 1);
			}
		}
		reader.close();
	}
}
