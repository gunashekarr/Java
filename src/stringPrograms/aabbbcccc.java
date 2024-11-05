/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 91895
 *
 */
public class aabbbcccc {
	public static void main(String[] args) {
		String str = "aabbbccc";
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
		  char ch = str.charAt(i);
		  if(mp.containsKey(ch))
		  {
			  int count = mp.get(ch);
			  count++;
			  mp.replace(ch,count);
		  }
		  else
		  {
			  mp.put(ch,1);
		  }
		}
		
		for (Character key:mp.keySet()) {
			System.out.print(key+""+mp.get(key));
		}

	}

}
