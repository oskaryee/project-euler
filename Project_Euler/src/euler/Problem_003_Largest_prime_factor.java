package euler;

/**
 * Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143?
 */
public class Problem_003_Largest_prime_factor {
	public static void main(String[] args){
		
		double n = 600851475143.0; 		// n didn't fit as int
		int largest_factor = 1;			// starting with the smallest possible factor
		int possible_factor = 2;
		
		/*
		 * if n is divisible by possible_factor we check if it is the largest factor found
		 * no matter if the possible_factor found is the largest we divide n by it
		 * to avoid getting into an infinite loop
		 * vvvvvvvvvvv DOWN vvvvvvvvvvvvv
		 */
		
		while(possible_factor <= n){
			if(n % possible_factor == 0){	
				if(largest_factor < possible_factor) 
					largest_factor = possible_factor;
				n /= possible_factor;		
				possible_factor = 1;		
			}
			if(possible_factor < 3) possible_factor++;
			else possible_factor += 2;
			
			/* ^^^^^^^^^^^ UP ^^^^^^^^^^
			 * we want to check 2 to be a factor but since we are adding by 2 
			 * we need to make sure we are not stuck dividing by multiples of 2
			 * this way we check 2, then 3, 5, 7, etc, instead of 2, 4, 6, 8...
			 */
			
			
		}
		
		System.out.println(largest_factor);
	}

}
