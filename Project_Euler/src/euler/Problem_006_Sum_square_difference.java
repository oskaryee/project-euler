package euler;

/**
 * 
 * @author YEE
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 				1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * 
 * 				(1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural 
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 */

public class Problem_006_Sum_square_difference {
	
	public static void main(String [] args){
		
		System.out.println(square_of_sums(10));
		System.out.println(sum_of_squares(10));
		System.out.println(square_of_sums(10) - sum_of_squares(10));

		System.out.println(square_of_sums(100) - sum_of_squares(100));
		
	}
	
	public static int sum_of_squares(int n){
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++){
			sum += i*i;
		}
		
		return sum;
	}
	
	public static int square_of_sums(int n){
		
		int sum = 0;
		
		for(int i = 1; i <=n ; i++){
			sum += i;
		}
		return sum*sum;
	}

}
