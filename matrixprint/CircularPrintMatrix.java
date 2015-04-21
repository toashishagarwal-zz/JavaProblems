package matrixprint;

public class CircularPrintMatrix {

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
		
		circularPrint(input);
	}

	private static void circularPrint(int[][] input) {
		int cols = input[0].length;
		
		for (int i = 0 ; i < 3; i++) {
			if( i % 2 == 1) {
				for(int j = cols - 1 ; j >= 0 ;j--) 
					System.out.print(input[i][j] + "\t");
			} else {
				for (int j = 0 ; j < cols ;j++) 
					System.out.print(input[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
