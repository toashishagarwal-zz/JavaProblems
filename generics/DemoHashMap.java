package generics;

import java.util.HashMap;
import java.util.Map;

class SampleClass{
	
}

public class DemoHashMap {

	public static void main(String[] args) {
		SampleClass s1 = new SampleClass();
		SampleClass s2 = new SampleClass();
		
		Map<Object, Integer> counts = new HashMap<Object, Integer>();
		counts.put(s1, 1);
		counts.put(s2, 2);
	}
}
