/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

/**
 * @author 91895
 *
 */
public class RemoveDuplicateCharInString {
public static void main(String[] args) {
		String input = "ABCDABC";
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			String ch=""+input.charAt(i);
			if(result.contains(ch))
			{
				continue;
			}
			result+=ch;
		}
		System.out.println(result);
			
		}

	}

