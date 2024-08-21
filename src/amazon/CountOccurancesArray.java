/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

import java.util.Scanner;

/**
 * @author 91895
 * Write a script to count the number of occurrences of the given element in an array.
 */
public class CountOccurancesArray {
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  int a[] = {2,3,2,3,2,1};
	  System.out.println("Enter the element");
	  int num = sc.nextInt();
	  int count=0;
	  
	  for (int i = 0; i < a.length; i++) {
		if(a[i]==num)
		{
			count++;
		}
	}
	  System.out.println("The number of occurrences of the given element in an array -->"+count);
		

	}

}
