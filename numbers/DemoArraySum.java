package numbers;

import java.util.ArrayList;
import java.util.List;

public class DemoArraySum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(11);
		list.add(5);
		list.add(2);
		list.add(1);
		
		int z = 19;
		findIntegersSum(list, z);
	}
	
	public static void findIntegersSum(List<Integer> list, int z) {
		for(int i = 0 ;i < list.size(); i++) {
			for(int j = i+1 ; j< list.size(); j++) {
				if(list.get(i) + list.get(j) == z) {
					System.out.println(" X = " + list.get(i) + "\t Y=" + list.get(j));
					return;
				}
			}
		}
		System.out.println(" No match found !!");
	}
}
