/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package interview;

/**
 * @author 91895
 *
 */
public class OracleString {
	public static void main(String[] args) {
String input = "my name is java";
        
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Swap the first word with the last word
        String result = words[words.length - 1]; // Start with the last word
        
        // Append the rest of the words (excluding the last word) in original order
        for (int i = 0; i < words.length - 1; i++) {
            result += " " + words[i];
        }
        
        // Print the final result
        System.out.println(result);

	}

}
