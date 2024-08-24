/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

/**
 * @author 91895
 *
 */
public class MoveZerosToFront {
public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int end = arr.length-1;
        
        for (int i = arr.length-1; i >=0; i--) {
			if(arr[i]!=0)
			{
				arr[end]=arr[i];
				end--;
			}
		}
        
        for (int i = end; i >=0; i--) {
			arr[i]=0;
		}

        // Print the result
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
    }
}