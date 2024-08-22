/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

/**
 * @author 91895
 * Given a number in an array form. Write a program to move all zeros to the end.
 * Input = 9,0,1,0,13,0,0,9
 * Output = 9,1,13,9,0,0,0,0
 */
public class ZeroPositionSwapping {
  public static void main(String[] args) {
	int arr[] = {9,0,1,0,13,0,0,9};
	int start = 0;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0)
		{
			arr[start]=arr[i];
			start++;
		}
		
	for (int i1 = start; i1 < arr.length; i1++) {
		arr[i1]=0;
	}
	
	//print 
	for (int i2 = 0; i2 < arr.length; i2++) {
		System.out.println(arr[i2]+" ");
		
	}
		
	}
	System.out.println("Size of the array : "+ arr.length);
	
	
}

}
