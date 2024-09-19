/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 91895
 * HashMap
 */
public class CountOccurances {
	public static void main(String[] args) {
		String input = "test";
		countOccurances(input);
	}
	public static void countOccurances(String input)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch:input.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println("Name" + ":" + map);
		
	}

}
