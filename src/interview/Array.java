/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 91895
 *
 */
public class Array {
	public static void main(String[] args) {
		int arr[] = {11,9,16,3,1,9,11};
		
//		duplicateElements(arr);
//		System.out.println();
//		duplicateElementsUsingCollections(arr);
//		frequencyCount(arr);
		reverseArray2(arr);

	}
	
	//Print duplicate elements of an array
	public static void duplicateElements(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j])
				{
					System.out.print(array[i]+" ");
				}
			}
		}
	}
	
	
	//Print duplicate elements of an array using collections
		public static void duplicateElementsUsingCollections(int[] array)
		{
			Set<Integer> seenSet = new HashSet<Integer>();
			Set<Integer> duplicatesSet = new HashSet<Integer>();
			
			for(int arr : array)
			{
				if(seenSet.contains(arr))
				{
					duplicatesSet.add(arr);	
				}
				else
				{
					seenSet.add(arr);
				}
			}
			
			// Print the duplicates
	        if (duplicatesSet.isEmpty()) {
	            System.out.println("No duplicate elements found.");
	        } else {
	            System.out.println("Duplicate elements are: " + duplicatesSet);
	        }
		}
	
	//Find the frequency of each element in an array
	public static void frequencyCount(int[] array)
	{
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int arr:array)
		{
			if(mp.containsKey(arr))
			{
				mp.put(arr,mp.get(arr)+1);
			}
			else
			{
				mp.put(arr,1);
			}
		}
		
		//Print
		for(Entry<Integer, Integer> entry : mp.entrySet())
		{
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
	}	
	
	    //Print the array in reverse order
		public static void reverseArray1(int[] array)
		{
			for(int i=array.length-1;i>=0;i--)
			{
				System.out.print(array[i]+" ");
			}
		}
		
		//Print the array in reverse order
		public static void reverseArray2(int[] array)
		{
			int left = 0;
			int right = array.length-1;
			
			while(left<right)
			{
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				
				left++;
				right--;
			}
			
			for (int arr : array) {
	            System.out.print(arr + " ");
	        }
	    }
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
