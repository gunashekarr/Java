/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

/**
 * @author 91895
 *
 */
public class EvenOdd {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" is a even number");
			}
			else
			{
				System.out.println(a[i]+" is a odd number");
			}
		}
	}

}
