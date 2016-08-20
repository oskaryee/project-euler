package euler;

/**
 * Problem Description
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 */

public class Problem_002_Even_Fibonacci_numbers {
	public static void main(String [] args){
		int total = 0;
		int max   = 4000000;
		int fib_1 = 1;
		int fib_2 = 2;
		
		while(fib_2 < max){
			if(fib_2 % 2 == 0) total += fib_2;
			
			int temp = fib_2;
			fib_2 += fib_1;
			fib_1 = temp;
		}
		
		System.out.println(total);
	}
}