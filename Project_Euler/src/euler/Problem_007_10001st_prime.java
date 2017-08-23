package euler;

import java.util.Stack;

/**
 * 
 * @author YEE
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 */

public class Problem_007_10001st_prime {
	
	public static void main(String [] args){
		/*
		 * Stack solution
		 */
		Stack<Integer> prime_s = new Stack<Integer>();
		prime_s.push(2); prime_s.push(3); prime_s.push(5); prime_s.push(7); prime_s.push(11);
		
		for(int i = 13; prime_s.size() < 10001; i+=2){
			if(check_if_prime(i, prime_s)){
				prime_s.push(i);}}
		
		System.out.println("The 10,001 prime is: " + prime_s.pop());
		
		/**************************************************************/
		
		/*
		 * Array solution
		 */
		int [] primes = new int [10001];
		primes[0] = 2; primes[1] = 3; primes[2] = 5; primes[3] = 7; primes[4] = 11; 
		
		int next_prime = 5; 
		
		for(int i = 13; next_prime < 10001; i+=2){ // Only check odd #'s => i+=2
			if(check_if_prime(i, primes)){
				primes[next_prime++] = i;}} 
		
		System.out.println("The 10,001 prime is: " + primes[primes.length - 1]);
		
	}
	
	public static boolean check_if_prime(int n, int [] primes){
				
		// Testing bottom half of factors. 
		int max = n / 2 + 1; 
		
		// Ex. n = 41; testing known primes between 2 - 22
		for(int i = 0; primes[i] < max; i++){
			if(n%primes[i] == 0){
				return false;}}

		return true;
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
