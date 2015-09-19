package hackerrank.bitmanipulation;

import java.util.Scanner;

public class SansaXOR {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T > 0) {
			int n;
			int result = 0;
			n = scanner.nextInt();
			int[] array = new int[n+1];
			
			for(int i = 1; i<=n ;i++) {
				array[i] = scanner.nextInt();
				
				if(((i * (n-1-i)) % 2) != 0) {
					result ^=array[i]; 
				}
			}
			System.out.println(result);
			T -= 1;
			array = null;
		}
	}
}
