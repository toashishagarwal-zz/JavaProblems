package iteration;

import java.util.LinkedList;
import java.util.Queue;

public class DriverProgram {

	public static void main(String[] args) {
		Folder<Integer,Integer> folder = new MyFolder<Integer, Integer>();

        Queue<Integer> q = new LinkedList<Integer>();

        for(int lop =0; lop < Integer.MAX_VALUE; lop++ ){ //add some values in the Queue
            q.add(lop);
        }
        Integer result = folder.fold(0, q, new Function2<Integer, Integer, Integer>() {
            public Integer apply(Integer val1, Integer val2) {
                return val1 + val2;
            }
        });

        System.out.println("Result: " + result);

	}

}
