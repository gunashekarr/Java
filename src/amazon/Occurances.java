/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

import java.util.Scanner;

/**
 * @author 91895
 * Write a script to print the number of occurrences of a given character or all letters in a string.
 */
public class Occurances {
	public static void main(String[] args) {
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		char characters[] = str.toCharArray();
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		for (int i = 0; i < characters.length; i++) {
			if(characters[i]==(ch))
			{
				count++;
			}
		}
		System.out.println("count :"+count);

	}

}
