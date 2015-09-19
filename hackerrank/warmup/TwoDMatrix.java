package hackerrank.warmup;

import java.util.Scanner;

public class TwoDMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        
        int[][] matrix = new int[no][no];
        int i=0,j=0, k=0;
        int[] element = new int[no*no];
        while(scanner.hasNextInt()) {
            element[i++] = scanner.nextInt();
        }
        
        i=0; j=0;
        for (k =0 ;k < element.length ;) {
        	matrix[i][j++] = element[k++];
        	if( k % no == 0) {
        		i = i+1 ; j=0;
        	}
        }
        
        for(i=0; i<no; i++) {
            for(j=0;j<no;j++) {
                System.out.print(matrix[i][j] + "\t");
                if(j == 2)
                	System.out.println();
            }
        }
        
        int sum = 0;
        for(i=0; i<no; i++) {
            for(j=0;j<no;j++) {
                if( i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);

	}

}
