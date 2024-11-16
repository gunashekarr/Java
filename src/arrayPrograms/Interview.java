/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

/**
 * @author 91895
 *
 */
public class Interview {
	public static void main(String[] args) {
		int arr[] = {11,7,22,-4,0};
		
		// reverse an array
		reverseArray(arr);
	}
	
	public static void reverseArray(int arr[])
	{
		int i=0,j=arr.length,temp;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for (int i1 = 0; i1 < arr.length; i1++) {
			System.out.print(arr[i1]+" ");
		}
		
	}

}
