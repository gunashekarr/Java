/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

/**
 * @author 91895
 *
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		String input="GunashekargG";
		char ch[]=input.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
				{
					System.out.print(ch[i]+" ");
				}
			}
		}
	}

}
