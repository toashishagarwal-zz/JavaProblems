package hackerrank.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int[] elements = new int[no];
        int i =0;
        while(scanner.hasNextInt()) 
	       elements[i++] = scanner.nextInt();
        
        int countPositives=0, countNegatives=0, countZeros=0;
        for(int j=0; j<elements.length; j++) {
            if(elements[j] < 0)
                countNegatives++;
            
            if(elements[j] > 0)
                countPositives++;
            
            if (elements[j] == 0)
                countZeros++;
        }
        float plus = (float)(countPositives)/no;
        float minus = (float)countNegatives/no;
        float zeros =  (float)   countZeros/no;
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(zeros);
        System.out.println(2/4);

	}
}
