package hackerrank.string;

import java.util.Scanner;

public class AlternatingChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		for (int i =0 ; i< no; i++) {
			System.out.println(findMinDeletions3(scanner.next()));
		}
	}
	
	static int findMinDeletions3(String input) {
		if(input.length() <= 1)
			return 0;
		int deletes = 0;
		char c = input.charAt(0);
		
		for (int i = 1; i<input.length() ;i++) {
			if(c == input.charAt(i)) {
				deletes++;
			} else {
				c = input.charAt(i);
			}
		}
		return deletes;
	}
}
