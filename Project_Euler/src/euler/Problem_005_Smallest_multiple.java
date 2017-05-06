package euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem_005_Smallest_multiple {
	
	public static void main(String [] args){
		
		/* For this we need a range. That would be between the product of primes between 1-20 and 20 factorial
		 * 9699690 < smallest multiple < 20!
		 * 
		 * I also believe there are high profile numbers, these are numbers between 11 through 20. 
		 * If a number is divisible by high profile numbers then low profile numbers shouldn't be an issue.
		 * 
		 * Wanted to make sure I would get the correct result for that I started with what I knew. 
		 * Since I knew the smallest multiple for 10, I made sure my method could get the correct answer then try with 20.
		 */
		
		int test_min = 210;
		
		int test_max = 2520 * 2;
		
		int [] test_primes = {2,3,5,7};
		
		int [] test_profiles = {10,9,8,6};
		
		System.out.println("Smallest multiple: " + smallest_multiple(test_min, test_max, 10, test_primes, test_profiles));
		
		
		
		int min = 9699690 + 10,
		
		    max = Integer.MAX_VALUE;
		
		int [] primes = {2, 3, 5, 7, 11, 13, 17, 19},
				
		       high_profile = {20, 18, 16, 15, 14, 12}; 
		
		System.out.println("Smallest multiple: " + smallest_multiple(min, max, 20, primes, high_profile));
				
	}
	
	public static boolean check(int [] array, int n){
		
		int arrayLength = array.length;
		
		for(int i = 0; i < arrayLength; i++)
			if(n%array[i] != 0)
				return false;
		
		return true;
	}
	
	public static int smallest_multiple(int min, int max, int interval, int [] primes, int [] high_profile){
		
		int multiple = min;
				
		while (multiple < max){
						
			if(check(primes, multiple)){ // if the integer in question is at least divisible by primes there's a chance
								
				if(check(high_profile, multiple)){
					
					return multiple;
					
				} 
				
			}
			
			multiple+=interval;

		}
		
		return multiple;
	}
	
}
