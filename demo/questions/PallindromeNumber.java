package demo.questions;

public class PallindromeNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int number = 212; 
        System.out.println( number + " is pallindrom ? " + isPallindrome(number));
    }

    private static boolean isPallindrome(int number) {
        if (number < 0) return false;
        int div = 1;
        while (number / div >= 10) {
          div *= 10;
        }        
        while (number != 0) {
          int l = number / div;
          int r = number % 10;
          if (l != r) return false;
          number = (number % div) / 10;
          div /= 100;
        }
        return true;
    }
    
}
