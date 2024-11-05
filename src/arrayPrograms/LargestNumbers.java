/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

/**
 * @author 91895
 *
 */
public class LargestNumbers {
	public static void main(String[] args) {
		int arr[] = {11,8,22,9,99};
		int firstLargest = 0;
		int secondLargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(firstLargest<arr[i])
			{
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			else if(secondLargest<arr[i])
			{
				secondLargest=arr[i];
			}
		}
		
		System.out.println("First Largest : "+ firstLargest);
		System.out.println("Second Largest : "+ secondLargest);

	}

}
