package hackerrank.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();	

        for(int i = 1; i<= no ; i++) {
        	print(i, no);
        }
	}
	
	static void print(int lineNumber, int height) {
		for(int i =0 ;i< (height - lineNumber) ; i++) 
			System.out.print(" ");
		
		for(int i =0 ;i<lineNumber; i++) 
			System.out.print("#");
		System.out.println();
	}
}
