/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

/**
 * @author 91895
 *
 */
public class sumOfElements {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+ a[i];
		}
		System.out.println("Sum of the Array : "+sum);

	}

}
