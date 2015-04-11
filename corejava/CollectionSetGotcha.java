package corejava;

import java.util.HashSet;

class Pojo {
	String str;
	
	Pojo(String s) {
		this.str = s;
	}
	
	@Override
	public String toString() {
		return str;
	}
}

public class CollectionSetGotcha {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		String s1 = new String("abc");
		String s2 = new String("abcd");
		Pojo s3 = new Pojo("abc");
		Pojo s4 = new Pojo("abcd");
		String s5 = "abc";
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		for (Object o : set) {
			System.out.print(o + "\t");
		} 
	}

}
