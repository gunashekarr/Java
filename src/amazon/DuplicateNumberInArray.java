/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

import java.util.HashSet;

/**
 * @author 91895
 *
 */
public class DuplicateNumberInArray {
public static void main(String[] args) {
		int arr[] = {1,2,11,1,11,1};
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Value : "+ arr[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false)
		{
			System.out.println("No Duplicates found");
		}

	}

}
