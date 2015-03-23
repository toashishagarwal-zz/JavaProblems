package generics;

import java.util.ArrayList;
import java.util.List;

class Apple{
	
}

public class DemoGenerics {

	public static void main(String[] args) {
		List<Apple> appleList = new ArrayList<Apple>();
		
		//if(appleList instanceof List<Apple>)
				System.out.println("true");

	}

}
