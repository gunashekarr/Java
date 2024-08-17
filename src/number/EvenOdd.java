/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package number;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the Values-->");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		if (num%2==0) 
		{
			System.out.println("Entered Number is Even");
		}
		else if(!(num%2==0)) // Not equal combination
		{
			System.out.println("Entered Number is Odd");
		}
		else
		{
			System.out.println("Entered Number is not valid");
		}


	}

}
