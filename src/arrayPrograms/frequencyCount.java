/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package arrayPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author 91895
 *
 */
public class frequencyCount {
	public static void main(String[] args) {
		int arr[] = {1,4,1,5,1,7};
		
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for (int num:arr) {
			if(mp.containsKey(num))
			{
				mp.put(num,mp.get(num)+1);
			}
			else
			{
				mp.put(num,1);
			}
		}
        System.out.println(mp);
        
        //For each print
        for(int key : mp.keySet())
        {
        	System.out.println(key+":"+mp.get(key));
        }
	}

}
