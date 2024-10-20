/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

/**
 * @author 91895
 *
 */
public class TwoDArray {
	public static void main(StringDemo[] args) {
		int arr[][] = {{1,2},{3,4}};
		
		for (int[] a:arr) {
			System.out.println(a);
			for (int b:a) {
				System.out.println(b);
			}
		}

	}

}
