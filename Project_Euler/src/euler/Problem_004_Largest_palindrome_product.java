package euler;

/**
 * Largest palindrome product
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem_004_Largest_palindrome_product {

	public static void main(String[] args){
		/*
		 * We know the largest 2 digit palindrome is 9009 so that is a starting point. 
		 * I wanted to get the product of the largest numbers first, thats why py = px
		 * As seen below, I only care about the numbers shown, blank slots are ignored.
		 * py
		 * 
		 * 3|      9 
		 * 2|    4 6
		 * 1|  1 2 3 
		 * 0|0 0 0 0 
		 *  --------
		 *   0 1 2 3 px
		 */
		int largest_palindrome = 9009;
		for(int px = 999;px > 100; px--){
			for(int py = px; py < 1000; py++){
				// check if the product is a palindrome and whether its the largest
				int poss_palindrome = py * px;
				if(is_palindrome(poss_palindrome) && largest_palindrome < poss_palindrome){
					largest_palindrome = poss_palindrome;
				}
			}
		}
		System.out.println("Largest Palindrome = " + largest_palindrome);
	}
	public static boolean is_palindrome(int palindrome){
		int palindrome_len = String.valueOf(palindrome).length();
		int [] split = new int[palindrome_len];
		int temp = palindrome;
		
		// Splitting the input into an array, orientation doesn't matter  
		for(int i = 0; i < palindrome_len; i++){
			split[i] = temp % 10;
			temp /= 10;
		}
		
		// Comparing slots to check if its a palindrome. 
		// If only one test fails we know its not a plaindrome
		int half = palindrome_len / 2;
		for(int i = 0; i < half; i++){
			if(split[i] != split[palindrome_len - 1 - i]){
				return false;
			}
		}
		
		return true;
	}
}
