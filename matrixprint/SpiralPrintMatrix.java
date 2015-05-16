package matrixprint;

public class SpiralPrintMatrix {

	public static void main(String[] args) {
		int[][] input = new int[3][3];
		input[0][0] = 1;
		input[0][1] = 2;
		input[0][2] = 3;
		input[1][0] = 4;
		input[1][1] = 5;
		input[1][2] = 6;
		input[2][0] = 7;
		input[2][1] = 8;
		input[2][2] = 9;
		
		spiralPrint(input);
	}

	private static void spiralPrint(int[][] input) {
		if(input.length == 0) 
			return;
		int top = 0;
		int down = input.length - 1;
		int left = 0;
		int right = input[0].length - 1;
		
		while (true) {
			// Print top row
			for (int j = left; j<=right ; ++j)
				System.out.print(input[top][j] + " ");
			top++;
			
			if(isBoundaryReached(top, down, left, right)) 
				break;

			// Print rightmost column
			for(int i = top ; i<=down ; ++i)
				System.out.print(input[i][right] + " ");
			right--;
			
			if(isBoundaryReached(top, down, left, right)) 
				break;
			
			//Print the bottom row
	         for(int j = right; j >= left; --j) 
	        	 System.out.print(input[down][j] + " ");
	         down--;
	         
	         if(isBoundaryReached(top, down, left, right)) 
	        	 break;
	         
	         //Print the leftmost column
	         for(int i = down; i >= top; --i) 
	        	 System.out.print(input[i][left] + " ");
	         left++;
	         
	         if(isBoundaryReached(top, down, left, right)) 
	        	 break;
		}
	}

	private static boolean isBoundaryReached(int top, int down, int left, int right) {
		return (top > down || left > right);
	}
}
