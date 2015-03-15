package demo.questions;

public class NaturalNumbers {
    public static void main(String[] args) {
        int[] naturalNumbers = {1,2,3,4,5,6,7,9,10};
        System.out.println("Missing number is : " + findMissingNumber(naturalNumbers));
        
        int[] repeatedNumberArray = {1,2,3,4,4,5,6,7,8,9,10};
        System.out.println("Repeated number is : " + findRepeatedNumber(repeatedNumberArray));
    }
    
    public static int findMissingNumber(final int[] input) {
        final int length = input.length + 1; // Added 1 bcoz 1 number is missing
        int expectedSum = ((length * (length + 1)) / 2);
        int actualSum = 0;
        for (int i : input) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }

    public static int findRepeatedNumber(final int[] input) {
        final int length = input.length - 1; // Removing 1 bcoz 1 number is repeated
        int expectedSum = ((length * (length + 1)) / 2);
        int actualSum = 0;
        for (int i : input) {
            actualSum += i;
        }
        return actualSum - expectedSum;
    }
}
