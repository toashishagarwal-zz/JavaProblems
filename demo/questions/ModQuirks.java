package demo.questions;

public class ModQuirks {

    public static void main(String[] a) {
        int num1 = 3;
        int mod = 4;
        int count=0; int i=0, j=0;
        if(num1 >= mod) {
            while(num1 % mod >= 0) {
                count++;
                i = num1 % mod;
                j = num1 / mod;
                if (i + j >= mod) {
                    num1 = i + j;
                } else {
                    break;
                }
            }
        }
        System.out.println(">> count --> " + count);
    }
}
