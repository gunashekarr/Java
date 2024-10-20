/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

/**
 * @author 91895
 *
 */
public class CountOccurance {
	public static void main(String[] args) {
		String input = "test java";
		char ch = 'a';
		int count=0;
		for(char chr:input.toCharArray())
		{
			if(chr==ch)
			{
				count++;
			}
		}
		System.out.println("the number of occurance is : "+count);

	}

}
