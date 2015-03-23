package numbers;

public class TryNumbers {

	public static void main(String[] args) {
		String a = "foo";
		String b = "food".substring(0, 3);
		String c = b.intern();

		if(a.equals(b)){
			System.out.println("a=" + a.hashCode() + " \t b=" + b.hashCode());
				if(a == b) {
					System.out.println("1");
				} else if (a == c) {
					System.out.println("2");
				} else {
					System.out.println("3");
				}
		} else {
			System.out.println("4");
		}
		
		System.out.println("foo".equals("food".substring(0,3)));
	}

}
