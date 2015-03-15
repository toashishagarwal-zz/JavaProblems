package demo.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*************************************************************************************
 *      For a given unsorted integer array, it finds out the repeats in the array    *
 *      @author agarwala                                                             *
 *                                                                                   *   
 ************************************************************************************/
public class IntegerArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] input = new int[7];
        input[0] = 4;
        input[1] = 4;
        input[2] = 2;
        input[3] = 5;
        input[4] = 5;
        input[5] = 9;
        input[6] = 4;
        
        printRepeats(input);
    }
    
    private static void printRepeats(int[] input) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < input.length ;i++) {
            Integer temp = map.get(input[i]); 
            if( temp == null ) {
                map.put(input[i], 1);
            } else {
                map.put(input[i], temp + 1);
            }
        }
        
        Set<Entry<Integer, Integer>> set = map.entrySet();
        for(Entry<Integer, Integer> e : set) {
            if((Integer)e.getValue() > 1) {
                System.out.println("" + e.getKey());
            }
        }
    }

}
