/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

import java.util.Scanner;

/**
 * @author 91895
 * Write a script to count the number of occurrences of the given element in an array.
 */
public class OccurancesArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,4,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("The Array : 1,2,3,1,4,1 ");
		System.out.println("Enter the number to find in the array");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=0;i < arr.length;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.println("The number of time : "+count);

	}

}
