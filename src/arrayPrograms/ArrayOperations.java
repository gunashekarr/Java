/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

/**
 * @author 91895
 *
 */
public class ArrayOperations {

	public static void main(String[] args) {
		int aar[] = {1,9,2,11,0};
		System.out.println("Sum of the Array : "+sumArray(aar));
		System.out.println("Sum of the Array : "+maxArray(aar));
		System.out.println("Sum of the Array : "+minArray(aar));

	}
	public static int sumArray(int[] arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
		
	}
	public static int maxArray(int[] arr)
	{
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}
	public static int minArray(int[] arr)
	{
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
		
	}

}
