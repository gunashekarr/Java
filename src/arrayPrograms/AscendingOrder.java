/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

/**
 * @author 91895
 *
 */
public class AscendingOrder {
	public static void main(String[] args) {
		int arr[] = {2,7,8,2,1};
		System.out.println("Before Sorting");
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");	
			}
		

	}

}
