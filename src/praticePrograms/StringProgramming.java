/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package praticePrograms;

/**
 * @author 91895
 *
 */
public class StringProgramming {
	
	public static String revereseString(String input)
	{
		StringBuilder reverseString =  new StringBuilder(input);
		return reverseString.reverse().toString();
	}
	
	public static boolean palindrome(String input)
	{
		StringBuilder reverseString =  new StringBuilder(input);
		String rev= reverseString.reverse().toString();
        if(rev.equals(input))
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String input="guna";
        System.out.println("Reverse String : " +revereseString(input)); // level
        System.out.println("Palindrome Status : " +palindrome(input));  // true
        
	}

}
