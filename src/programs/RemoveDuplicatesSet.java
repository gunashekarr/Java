/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package programs;

/**
 * @author 91895
 *
 */
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesSet {
	
	


	    public static String removeDuplicatesUsingSet(String input) {
	        Set<Character> charSet = new LinkedHashSet<>();
	        
	        for (char c : input.toCharArray()) {
	            charSet.add(c);
	        }
	        
	        StringBuilder result = new StringBuilder();
	        for (char c : charSet) {
	            result.append(c);
	        }
	        
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String input = "programming";
	        String result = removeDuplicatesUsingSet(input);
	        System.out.println("String without duplicates: " + result);
	    }
	}



