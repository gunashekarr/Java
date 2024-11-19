/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package interview;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 91895
 *
 */
public class DuplicateNumInArray {
	public static void main(String[] args) {
		int a[] = {11,77,44,11,44};
		
		Set<Integer> duplicateSet = new HashSet<Integer>();
		Set<Integer> originalSet = new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if()
			{
				duplicateSet.add(a[i]);
			}
			else
			{
				originalSet.add(a[i]);
			}
		}
		
		System.out.println("Non-Duplicate Set-->"+duplicateSet);
		System.out.println("Duplicate Set-->"+originalSet);

	}

}
