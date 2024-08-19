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
public class MultiDimensionArray {
	public static void main(String[] args) {
		
		// Approach 1 : Use when you know the size
		System.out.println("Approach 1");
		int a[][] = new int[3][2]; // Declare an array
		//int [][]a = new int[3][2]; // Declare an array
		//int []a[] = new int[3][2]; // Declare an array
		
		a[0][0]=100;             // add values into array
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
				
		// Approach 2 : : Use when you don't know the size, where we can modify(add/remove) later
		System.out.println("Approach 2");
		int b[][] = {{600,700},{800,900},{1000,1100}}; // Declare an array & add values into array
		
		
		System.out.println("Number of Rows : "+b.length); // Find row size of an array
		System.out.println("Number of Columns : "+b[0].length); // Find column size of an array
		
		System.out.println(b[0][0]); // read single value from an array	
		
		System.out.println("Classic For Loop Print");
		for (int r = 0; r < b.length; r++) 
		{
		  for (int c = 0; c < b[r].length; c++) 
		    {
			  System.out.print(b[r][c]+" ");
			}
		  System.out.println();
		}
		
		System.out.println("Advances For Loop / For each loop Print");
		for (int arr[] : b) 
		{
			for(int x : arr) 
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
	}

}
