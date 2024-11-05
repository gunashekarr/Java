/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

/**
 * @author 91895
 *
 */
public class ArrayDemo {
	public static void main(String[] args) {
		
		int arr[]= {11,12,07,13};
		arrayBasicOperations(arr);
		
		
		
	}
	
	public static void arrayBasicOperations(int arr[])
	{
		int sum=arr[0], max=arr[0], min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Sum -->"+sum);
		System.out.println("Max -->"+max);
		System.out.println("Min -->"+min);
	}
	
	public static void secondLargestNumber(int arr[])
	{
		int firstLargeNumber=arr[0];
		int secondLargeNumber=arr[0];
		
		
	}

}
