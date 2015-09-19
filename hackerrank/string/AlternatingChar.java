package hackerrank.string;

import java.util.Scanner;

public class AlternatingChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		for (int i =0 ; i< no; i++) {
			System.out.println(findMinDeletions(scanner.next()));
		}
	}
	
	static int findMinDeletions(String input) {
		int ab = input.indexOf("AB");
		int ba = input.indexOf("BA");
		if (ab < 0 && ba < 0) 
			return input.length() - 1; 
		
		if(ab == 0) {
			return getCount(input, "AB");
		}
		
		if(ba == 0) {
			return getCount(input, "BA");
		}
		
		if(ab > 0) {
			return getCount(input, "AB");
		}
		
		if(ba > 0) {
			return getCount(input, "BA");
		}
		
		return -1;
	}
	
	private static int getCount(String input, String check) {
		int count=0;
		input = input.replaceAll(check, "##");
		for (int i = 0 ; i< input.length(); i++) {
			if(input.charAt(i) != '#') {
				count++;
			}
		}
		return count;
	} 
}
