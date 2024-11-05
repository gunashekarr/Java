/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

/**
 * @author 91895
 *
 */
public class P2a3b4c {
	public static void main(String[] args) {
		String str = "2a3b4c";
		StringBuilder output = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
			    int count = Character.getNumericValue(str.charAt(i));
			    char ch = str.charAt(i+1);
			    
			    for (int j = 1; j <= count; j++) {
					output.append(ch);
				}
			    i++;
			}
		}

		System.out.println("Output : "+output.toString());
	}

}
