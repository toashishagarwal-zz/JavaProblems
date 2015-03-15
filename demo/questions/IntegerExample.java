package demo.questions;

import java.util.Set;
import java.util.TreeSet;

public class IntegerExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(1+4+"hello"+5+6);
        Set<Integer> set = new TreeSet<Integer>();
        set.add(4);
        set.add(4);
        set.add(3);
        set.add(4);
        set.add(3);
        for(Integer i : set) {
            System.out.println(i);
        }
    }

}
