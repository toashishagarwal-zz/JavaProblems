package hackerrank.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i = 0 ;i<t; i++) {
        	System.out.println(findHeight(in.nextInt()));
        }

	}
	
	static int findHeight(int cycles) {
		int height = 1;
		for (int i = 1; i<=cycles ; i++) {
			if(i%2 != 0 ) {
				height *= 2;
			} else {
				height+=1;
			}
		}
		return height;
	}
}
