package hackerrank.bitmanipulation;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i=0 ;i < n;i++) {
			System.out.println(flip(scanner.nextLong()));
		}
	}

	private static long flip(long number) {
		long mask = 0xffffffffl;
		return number ^ mask;
	}	
		
}
