package hackerrank.warmup;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] elements = new int[6];
        int i =0;
        while(scanner.hasNextInt()) 
            elements[i++] = scanner.nextInt();
        
        int[] actual = {elements[0], elements[1], elements[2]};
        int[] expected = {elements[3], elements[4], elements[5]};

        System.out.println(getFine(actual, expected));
	}
	
	static int getFine(int[] actual, int[] expected) {
		if(actual[2] > expected[2]) 
			return  10000;
        
        if(actual[2] == expected[2] && actual[1] > expected[1]) 
        	return  (actual[1] - expected[1]) * 500;
        
        if (actual[2] == expected[2] && actual[1] == expected[1] && actual[0] > expected[0]) 
            return (actual[0] - expected[0]) * 15;
       
       return 0;
	}

}
