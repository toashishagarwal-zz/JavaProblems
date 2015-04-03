package geekforgeek.arrays;

public class ArrayReverseInPlace {

	public static void main(String[] args) {
		int[] input = {3,2,4,5};
		int[] result = reverse(input);
		print(result);
	}

	private static void print(int[] result) {
		for(Integer i : result)
			System.out.print(i + "\t");
	}	

	private static int[] reverse(int[] input) {
		int temp=0;
		for(int i = 0, j = input.length-1; i <=j ; i++, j--) {
			temp = input[j];
			input[j] = input[i];
			input[i] = temp;
		}
		return input;
	}
}
