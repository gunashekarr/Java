/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

/**
 * @author 91895
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		String input = "level1";
		String sentance = "No lemon, no melon";
		isPalindromeWord(input);
//		isPalindromeWords(sentance);
		reverseString(input);
	}
	public static void isPalindromeWord(String input)
	{
		StringBuilder sc = new StringBuilder(input).reverse();
		System.out.println("After StringBuilder : "+sc);
		if(sc.toString().equals(input))
		{
			System.out.println("Its an Palindrome!!");
		}
		else
		{
			System.out.println("Its not an Palindrome!!");
		}
	}
		public static void isPalindromeWords(String sentance)
		{
	        String[] words1=sentance.split(",");
//			StringBuilder sc = new StringBuilder();
			for(String words:words1)
			{
				StringBuilder sc1 = new StringBuilder(words);
				System.out.print(sc1.reverse().toString()+" ");
			}
//			System.out.println("After StringBuilder : "+sc.reverse());
				
	}
		public static void reverseString(String input)
		{
			StringBuilder sc = new StringBuilder(input).reverse();
			System.out.println("Reversed String : "+sc.toString());
		}

}
