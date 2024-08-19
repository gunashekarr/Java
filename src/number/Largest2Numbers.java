/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package number;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class Largest2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = (a>b)?a:b;
		System.out.println("Largest Number-->"+res);
	}

}
