/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package number;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class ReverseNumber {
	public static void main(String[] args) {
		int num, rev=0;
		System.out.println("Enter the Values-->");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		while(num!=0)
		{
			int digit = num % 10;          // Extract the last digit
            rev = rev * 10 + digit; // Append the lastdigit to reversedNumber
            num=num/10;                    // Remove the last digit from the original number
     
		}
		System.out.println("The Reveresed number-->"+rev);
	}

}
