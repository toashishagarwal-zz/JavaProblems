package demo.questions;

public class PrintNumberInWords {

    /**
     * @param args
     */
    public static void main(String[] args) {
        printInWords(213);
    }
    
    private static void printInWords(int number) {
        if(number < 0)
            return;
        else {
            int div = 1;
            while(number / div >= 10) {
                div = div * 10;
            }
            System.out.println("div --> " + div);
        }
    }

}
