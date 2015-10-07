package codility;

public class WholeSquares {

	public static void main(String[] args) {
		System.out.println(solution(4, 17));
		System.out.println(solution(0, 0));
		System.out.println(solution(-10000, 10000));
	}

	public static int solution(int A, int B) {
		int count = 0;
		
		for (int i = A ;i <= B ;i++) {
			int sqrt = (int)Math.sqrt(i);
			if (sqrt * sqrt == i) 
				count++;
		}
		
        return count;
	}
	
}
