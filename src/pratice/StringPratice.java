/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 91895
 *
 */
public class StringPratice {
public static void main(String[] args) {
		String input = "Gunaaaa";
		String sentance = "Java is my favourite";
		String palindromeSentance = "nonon";
		System.out.println("Removed Duplicates-->"+removeDuplicates(input));
		occuranceCount(input);
		System.out.println("Reversed Words-->"+reverseWords(sentance));
		System.out.println("Palindrome Check-->"+palindromeCheck(palindromeSentance));

	}

// Remove Duplicates
	public static String removeDuplicates(String input)
	{
		Set<Character> ss = new HashSet<Character>();
		StringBuilder result = new StringBuilder();
		
		for(char ch:input.toCharArray())
		{
			ss.add(ch);
		}
		
		for(Character cc:ss)
		{
			result.append(cc);
		}
		
		
		return result.toString();
	}
	
// Find occurance of the characters in a string
	public static void occuranceCount(String input)
	{
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(char ch:input.toCharArray())
		{
			if(mp.containsKey(ch))
			{
			    mp.put(ch,mp.get(ch)+1);	
			}
			else
			{
				mp.put(ch,1);
			}
		}
		
		System.out.println(mp);
	}
	
	// Find the reverse of the string
	public static String reverseWords(String sentance)
	{
		String[] words = sentance.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word:words)
		{
			StringBuilder ss = new StringBuilder(word).reverse();
			result.append(ss).append(" ");
		}
		return result.toString();
		
		
	}
	
	// Check the given string is plaindrome or not
	public static boolean palindromeCheck(String palindromeSentance)
	{
		String reverseWord = new StringBuilder(palindromeSentance).reverse().toString();
		
		if(palindromeSentance.equals(reverseWord))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
