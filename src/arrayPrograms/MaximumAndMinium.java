/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

public class MaximumAndMinium {
	public static void main(String[] args) {
		int a[]= {0,4,3,4,6,1};
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max = a[i];
			}
			if(a[i]<max)
			{
				min = a[i];
			}
		}
		System.out.println("The maximum number of the array : "+max);
		System.out.println("The minimum number of the array : "+min);
	}
}
