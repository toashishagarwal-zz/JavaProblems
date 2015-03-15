package demo.questions;

import java.util.HashSet;
import java.util.Set;

public class IntegerArrayIntersection {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array1 = {2,3,4,5,6,7};
        int[] array2 = {3,6,79,8};
        Set<Integer> s = new HashSet<Integer>();
        
        for(Integer i : array1) {
            s.add(i);
        }
        
        for(Integer i : array2) {
            if(!s.add(i)) {
                System.out.println(i);
            }
        }
    }

}
