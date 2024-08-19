/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

import java.util.Arrays;

/**
 * @author 91895
 *
 */
public class SortingAscending {
	public static void main(String[] args) {
		
//	  Approach 1 : Using Inbuilt function	
      int numbers[] = {100,22,65,111,77};
      Arrays.sort(numbers);
      System.out.println("Length of the array : "+numbers.length);
      System.out.println("Sorted Array: " + Arrays.toString(numbers));

	}

}
