/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

/**
 * @author 91895
 *
 */
public class SortingWithoutBuild {
	public static void main(String[] args) {
		int arr[] = {11,4,12,1,7,};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp;
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Printing an array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//
		thirdtHighest(arr);
		System.out.println("Third Largest Number : " + thirdtHighest(arr));
	}
	
	
	// 3rd largest method in an array
	public static int thirdtHighest(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp;
				if(arr[j]<arr[i])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr[arr.length-2];
		
	}

}
