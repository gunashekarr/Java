/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package basic;

/**
 * @author 91895
 *
 */
public class ObjectArray {
	public static void main(String[] args) {
		
		// How to store different data types of data in array
		Object a[]= {11,11.11,'G',"GUNA"};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("==============Adavnced For Loop==========");
		for (Object x : a) {
			
			System.out.println(x);
			
		}
	}

}
