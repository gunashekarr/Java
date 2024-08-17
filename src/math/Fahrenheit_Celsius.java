/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package math;

import java.util.Scanner;

/**
 * @author 91895
 *
 */
public class Fahrenheit_Celsius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperatue in Fahrenheit");
		int temperature = sc.nextInt();
		
		int temp = ((temperature - 32)*5)/9;
		
		System.out.println("Temperatue in Celsius-->" + temp);

	}

}
