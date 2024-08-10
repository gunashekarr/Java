/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package programs;

/**
 * @author 91895
 *
 */
public class ReplaceCharacters {
	
	
	    // Method to replace all occurrences of a character
	    public static String replaceCharacter(String input, char oldChar, char newChar) {
	        return input.replace(oldChar, newChar);
	    }

	    public static void main(String[] args) {
	        String input = "hello world";
	        char oldChar = 'o';
	        char newChar = '0';
	        String result = replaceCharacter(input, oldChar, newChar);
	        System.out.println("Resulting string: " + result);
	    }
	}

