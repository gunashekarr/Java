/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package number;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class Factorial {
	
	public static void main(String[] args) {
		
		int num, fact=1;
		System.out.println("Enter the Values-->");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		if(num>0)
		{
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+num+" is = "+fact);
			
		}
		else
		{
			System.out.println("Invalid Number Entered");
		}
	}

}
