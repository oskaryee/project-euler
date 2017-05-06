package euler;

/*
 *  
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * 								a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * 
 * 
 */

public class Problem_009_Special_Pythagorean_triplet {

	public static void main(String [] args){
		int a, b, c;
		a = b = c = 0;
		boolean found = false;

		while(!found){
			a++;
			b = a + 1; 
			c = 1000 - b - a;
			while(b < c && !found){
				if((a*a + b*b) == (c*c)){found = true;} 
				else { b++; c--;}
			}
		}
				
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		System.out.println("The product is " + (a * b * c));

	}
}
