package corejava;

public class BooleanGotchas {

	public static void main(String[] args) {
		boolean b = false;
		int i = 1;
		do{
			i++;
		} while( b = !b);
		System.out.println(i);
		
		boolean value = true;
		if (value = false) {
			System.out.println("1");
		} else if (value) {
			System.out.println("2");
		} else
			System.out.println("3");
		
	}
}
