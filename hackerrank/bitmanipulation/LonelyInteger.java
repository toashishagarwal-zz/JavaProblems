package hackerrank.bitmanipulation;

import java.util.Scanner;

public class LonelyInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no = in.nextInt();
		int i = 0; 
		int[] elements = new int[no];
		while(in.hasNextInt())
			elements[i++] = in.nextInt();
		
		int result = 0;
		for (i=0; i<elements.length ;i++) {
			result ^= elements[i];
		}
		System.out.println(result);
	}
}
