package mathsrelated;

public class SquareRoot {

	public static void main(String[] args) {
		//System.out.println(sqrt(2));
		System.out.println(sqrt(5));
		/* System.out.println(sqrt(144));
		System.out.println(sqrt(9));
		System.out.println(sqrt(12)); */
	}
	
	public static double sqrt(final int number) {
		double t;
		double squareRoot = number / 2;
		 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
}
