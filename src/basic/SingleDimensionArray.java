/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package basic;

/**
single dimensional array
---------
1) Declare an array
2) add values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array
 */
public class SingleDimensionArray {
	public static void main(String[] args) {
		
		// Approach 1 : Use when you know the size
		System.out.println("Approach 1");
		int a[] = new int[5]; // Declare an array
		//int []a = new int[5]; // Declare an array
		a[0]=100;             // add values into array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println("Size of the array : "+a.length); // Find size of an array
		System.out.println(a[0]); // read single value from an array		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
				
		// Approach 2 : : Use when you don't know the size, where we can modify(add/remove) later
		System.out.println("Approach 2");
		int b[] = {600,700,800,900,1000}; // Declare an array & add values into array
		System.out.println("Size of the array : "+b.length); // Find size of an array
		System.out.println(b[0]); // read single value from an array		
		System.out.println("Classic For Loop Print");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("Advances For Loop / For each loop Print");
		for(int x:b)
		{
			System.out.println(x);
		}
	}

}
