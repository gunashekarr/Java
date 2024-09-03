/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package programs;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class ReverseNumber {
	
	public static void main(String[] args) {
		
//		System.out.println("Enter the Number:");
//		Scanner sc=new Scanner(System.in);
//		int num = sc.nextInt();
		int num=12345;
		reverseUsingLoop(num);
//		reverseUsingStringBuilder(num);
		
	}
	public static void reverseUsingLoop(int num)
	{
		int rev=0;
		// 1st Method
		while(num!=0)
		{
			rev=num%10+num/10;
		}
		System.out.println("The Reveresed Number-->"+rev);
		
	}
	public static void reverseUsingStringBuilder(int num)
	{
		StringBuilder sb=new StringBuilder(num);
		StringBuilder result = sb.reverse();
		System.out.println("The Reversed Number using String builder concept-->"+result.toString());
		
	}

}
