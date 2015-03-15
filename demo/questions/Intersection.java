package demo.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>(5);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(4);
        a1.add(1);
        
        ArrayList<Integer> a2 = new ArrayList<Integer>(5);
        a2.add(14);
        a2.add(7);
        a2.add(51);
        a2.add(8);
        a2.add(11);

        Set<Integer> set = new HashSet<Integer>(a1);
        boolean flag = false;
        for (Integer i : a2) {
            if(!set.add(i)) {
                flag = true;
                System.out.println(i + "\t");
            }
        }
        if(!flag) {
            System.out.println(" Sorry ! No intersection found");
        }
        
    }

}
