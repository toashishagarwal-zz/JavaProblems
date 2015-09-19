package hackerrank.warmup;

public class FindDigits {

	public static void main(String[] args) {
		int[] foo = {12, 1012, 234};
		findingDigits(foo);
	}
	
	static void findingDigits(int[] foo) {
        int count = 0;
        for (int  i= 0; i < foo.length; i++) {
            int number = foo[i];
            while (number > 0) {
                int digit = number % 10;
                
                if(digit == 1) {
                    count++;
                } else if(digit != 0 && foo[i] % digit == 0) {
                    count++;
                } 
                number /= 10;
            }
            System.out.println(count);
            count = 0;
        }
	}
}
