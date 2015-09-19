package hackerrank.bitmanipulation;

import java.util.Scanner;

public class MaximalXOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }

    static int maxXor(int l, int r) {
    	int max = 0;
    	for(int i = l; i<= r; i++) {
    		for(int j=i ; j<=r; j++) {
    			if( (i ^ j) > max) {
    				max = i^j;
    			}
    		}
    	}
    	return max;
	 }
	    
}
