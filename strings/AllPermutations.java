package strings;

public class AllPermutations {
	public static void main(String[] args) {
		permutation("", "ABCD");
	}
	
	private static void permutation(String prefix, String input ) {
		int n = input.length();
		if (n == 0 ) 
			System.out.println(prefix);
		else {
			for (int i=0; i<n ; i++) {
				//System.out.println("***** \n " + prefix + input.charAt(i) + " - " + input.substring(0, i) + input.substring(i + 1));
				permutation(prefix + input.charAt(i), input.substring(0, i) + input.substring(i + 1));
			}
		}
	}
}
