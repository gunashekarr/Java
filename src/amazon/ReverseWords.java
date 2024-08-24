/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

/**
 * @author 91895
 *
 */
public class ReverseWords {
public static void main(String[] args) {
		String input="Welcome to Amazon";
		System.out.print(reverseWords(input));
//		reverseWords(input);
	}
   public static String reverseWords(String input)
   {
	   String[] words = input.split(" ");
	   StringBuilder result = new StringBuilder();
	   
	   for(String word : words)
	   {
		   StringBuilder sc = new StringBuilder(word).reverse();
		   result.append(sc).append(" ");
	   }
	   return result.toString();
   }

}
