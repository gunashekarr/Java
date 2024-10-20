/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package number;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class LargestNumber {
	
	public static void main(String[] args) {
		int x, y, z;
		System.out.println("Enter three integers ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println(x+" is the largest number!!");
		}
		else if(y>z && y>x)
		{
			System.out.println(y+" is the largest number!!");
		}
		else if(z>x && z>y)
		{
			System.out.println(z+" is the largest number!!");
		}
		else
		{
			System.out.println("Entered number are not distinct"); // java.util.InputMismatchException - when string given
		}
	}

}
