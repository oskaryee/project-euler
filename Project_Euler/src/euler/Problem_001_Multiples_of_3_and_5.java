package euler;

/** Problem Descriptions
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000. 
 */


public class Problem_001_Multiples_of_3_and_5 {
	public static void main(String[] args){
		int total = 0;
		int max = 1000;
		
		for(int n = 3; n < max; n++){		// Start with three since it will be our smallest multiple
			if(n % 3 == 0 || n % 5 == 0){	// If the number is divisible by either number add
				total += n;					// This allows the exclusion of duplicates ie 15, 30, 45
			}
		}
		
		System.out.println(total);
	}
}