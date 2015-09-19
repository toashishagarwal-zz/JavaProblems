package hackerrank.implementation;

import java.util.Scanner;

public class AngryProf {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int noTCs = Integer.parseInt(scanner.nextLine());
	        
	        String[] testcases = new String[noTCs * 2 ];
	        
	        for(int i = 0; i< (noTCs * 2) ; i++) 
	           testcases[i] = scanner.nextLine();
	         
	        for(int i = 0; i < testcases.length; i = i+2) 
	            System.out.println(isCancelledClass(testcases[i], testcases[i+1]));
	        
	    }
	    
	    static String isCancelledClass(String students, String arrivalTimes) {
	        //int N = Integer.parseInt(students.substring(0, students.indexOf(" ")));
	        int K = Integer.parseInt(students.substring(students.indexOf(" ") + 1));
	        String[] times = arrivalTimes.split(" ");
	        int count = 0;
	        for(String a: times) {
	        	if(Integer.parseInt(a) <= 0 ) {
	        		count++;
	        	}
	        }
	        return (count < K) ? "YES" : "NO"; 
	    }
}
