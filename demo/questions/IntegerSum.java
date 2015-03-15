package demo.questions;

import java.util.Arrays;

/**********************************************************************************************************************
 *  Given int array & a number, find all sets of numbers from the int array whose sum equals the given number         *  
 *                                                                                                                    * 
 *  @author agarwala                                                                                                  *  
 *                                                                                                                    *
 *********************************************************************************************************************/
public class IntegerSum {

    /**
     * @param args
     */
    public static void main(String[] args) {
       int[] input = {3,2,1,4,5,8,9};
       printIntegerSetFormingAGivenSum(input, 6);
    }
    
    private static void printIntegerSetFormingAGivenSum(int[] input, int sumExpected) {
        // Step 1: Sort the given integer array
        Arrays.sort(input);

        // Step 2: Find the index of the number which is just less than sumExpected
        int uptoIndex = -1;
        for (int i=0;i<input.length; i++) {
            if(input[i] > sumExpected) {
                uptoIndex = i--;
                break;
            }
            if(input[i] == sumExpected) {
                uptoIndex = i;
                break;
            }
        }
        
        uptoIndex = (uptoIndex == -1) ? input.length - 1 : uptoIndex ;
        
        // Step 3: Iterate till the index in step 2s
        for (int i=0; i <= uptoIndex ; i++) {
            for (int j = i+1 ; j<= uptoIndex; j++) {
                if(input[i] + input[j] == sumExpected)
                    System.out.println("Pair is - " + input[i] + " and " + input[j]);
            }
        }
    }

}
