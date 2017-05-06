package euler;

import java.util.Stack;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */

public class Problem_010_Summation_of_primes {

	public static void main(String [] args){
		
		Stack<Integer> primes = new Stack<Integer>();
		long sum; 
		
		primes.push(2); primes.push(3); primes.push(5); primes.push(7); primes.push(11);
		sum = 2 + 3 + 5 + 7 + 11; 
		
		for(int i = 13; i < 2000000; i+=2){
			if(check_if_prime(i, primes)){
				sum += i;
				primes.push(i);
			}
		}
		
		System.out.println("The sum is " + sum);
		
		
	}
	
	public static boolean check_if_prime(int n, Stack<Integer> primes){
		
		int max = n / 2 + 1;
		
		// This was the main reason I didn't enjoy the stack method too much
		for(int i = 0; primes.get(i) < max; i++){
			if(n%primes.get(i) == 0){
				return false;}}
		
		return true;
	}
}
