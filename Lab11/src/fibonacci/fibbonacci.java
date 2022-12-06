package fibonacci;

import java.util.Scanner;

public class fibbonacci {
	public static int fibonacci(int n) {
	      /* Type your code here. */
	      
	      if (n > 0) {
	         
	         int[] fibArray = new int[n+1];
	         fibArray[0] = 0;
	         fibArray[1] = 1;
	         for(int i = 2; i<=n; ++i) {
	            fibArray[i] = (fibArray[i - 1] + fibArray[i - 2]);
	            
	            
	         }
	         return fibArray[n];
	         }
	      else if (n == 0) {
	       return 0;  
	      }
	      else {
	       return -1;  
	      }
	   }
	   
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int startNum;
	      
	      
	      
	      startNum = scnr.nextInt();
	      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
	   }
}
