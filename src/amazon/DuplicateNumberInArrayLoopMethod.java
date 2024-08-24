/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

import java.util.HashSet;

/**
 * @author 91895
 *
 */
public class DuplicateNumberInArrayLoopMethod {
public static void main(String[] args) {
		int arr[] = {1,2,11,1,11,1};
		boolean flag=false;
		
		HashSet<Integer> hs = new HashSet();
		
		for(int aa : arr)
		{
			if(hs.add(aa)==false)
			{
				System.out.println("The mentioned number is duplicate : "+aa);

				flag=true;
			}
		}

		if(flag==false)
		{
			System.out.println("No Duplicate Value in the array");
		}

	}

}
