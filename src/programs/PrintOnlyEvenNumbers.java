/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package programs;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class PrintOnlyEvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start and end number");
		int StartNumber = sc.nextInt();
		int EndNumber = sc.nextInt();
		
		for (int i = StartNumber; i <=EndNumber; i++) {
			if(i%2==0)
			{
				System.out.println(i);
				continue;
			}
			
		}

	}

}
