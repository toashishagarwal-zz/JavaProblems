package sample;

import java.util.Scanner;

public class TryScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		
		System.out.println(line1 + "\n" + line2);
		System.out.println(no);
	}
}
