/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 91895
 * Given are two ordered lists of sizes 7 and 3. The first list has three vacant spots in the end. 
 * Merge them in a sorted manner with a minimum number of steps.
 */
public class MergeListsWithLinkedList {
	 public static void mergeLists(int[] list1, int[] list2) {
	        int m = 4; // Number of valid elements in list1
	        int n = list2.length; // Number of valid elements in list2

	        List<Integer> mergedList = new LinkedList<>();
	        for (int i = 0; i < m; i++) {
	            mergedList.add(list1[i]);
	        }
	        for (int num : list2) {
	            mergedList.add(num);
	        }

	        mergedList.sort(Integer::compareTo);

	        for (int i = 0; i < mergedList.size(); i++) {
	            list1[i] = mergedList.get(i);
	        }
	    }

	    public static void main(String[] args) {
	        int[] list1 = {1, 3, 5, 7, 0, 0, 0}; // 7 elements with 3 vacancies
	        int[] list2 = {2, 6, 8}; // 3 elements
	        mergeLists(list1, list2);
	        System.out.println("List 1 after merging:");
	        for (int num : list1) {
	            System.out.print(num + " ");
	        }
	    }

}
