package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDifference {

	public static void main(String[] args) {
		List<Integer> set1 = new ArrayList<Integer>();
		set1.add(1);
		set1.add(7);
		set1.add(8);
		set1.add(2);
		set1.add(4);
		set1.add(5);
		
		List<Integer> set2 = new ArrayList<Integer>();
		set2.add(3);
		set2.add(5);
		set2.add(1);
		set2.add(7);
		set2.add(6);
		set2.add(9);

		System.out.println(intersection(set1, set2));
		System.out.println(union(set1, set2));
		System.out.println(difference(set1, set2));
		System.out.println(symmetricDifference(set1, set2));
		
		System.out.println("** Set operations using arrays");
		
		Integer[] tempSet3 = {1,7,8,2,4,5,7};
		Integer[] tempSet4 = {3,5,1,7,6,9};
		List<Integer> set3 = Arrays.asList(tempSet3);
		List<Integer> set4 = Arrays.asList(tempSet4);
		
		System.out.println(intersection(set3, set4));
		System.out.println(union(set3, set4));
		System.out.println(difference(set1, set2));
		System.out.println(symmetricDifference(set3, set4));
		
		System.out.println("*** Check whether 2 sets are disjoint ***");
		Integer[] sample1 = {1,2,8,3,5,4,4};
		Integer[] sample2 = {11,23,45,4};
		
		boolean disJoint = isDisJoint(Arrays.asList(sample1), Arrays.asList(sample2));
		System.out.println(" IsSets Disjoint? " + disJoint );
	}

	private static boolean isDisJoint(final List<Integer> sample1, final List<Integer> sample2) {
		@SuppressWarnings("unchecked")
		Collection<Integer> c = (List<Integer>)intersection(sample1, sample2);
		return c.isEmpty() ? true : false;
	}

	public static Collection intersection(List<Integer> s1, List<Integer> s2){
		List<Integer> result = new ArrayList<Integer>();
		
		for(Integer i : s1) {
			if(s2.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}

	public static Collection union(List<Integer> s1, List<Integer> s2){
		Set<Integer> result = new HashSet<Integer>(s1);
		result.addAll(s2);
		
		return result;
	}

	private static Collection symmetricDifference(List<Integer> set1, List<Integer> set2) {
		Set<Integer> union = (Set<Integer>)union(set1, set2);
		List<Integer> intersection = (List<Integer>)intersection(set1, set2);
		List<Integer> result = new ArrayList<Integer>();
		
		for(Integer i : union) {
			if(intersection.contains(i)) {
				// no op;
			} else {
				result.add(i);
			}
		}
		return result;
	}
	
	private static Collection difference(List<Integer> set1, List<Integer> set2) {
		Set<Integer> result = new TreeSet<Integer>(set1);
		result.removeAll(set2);
		return result;
	}
}
