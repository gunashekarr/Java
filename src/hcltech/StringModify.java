/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package hcltech;

/**
 * @author 91895
 *
 */
public class StringModify {
	
	public static void main(String[] args) {
		String str = "ABCD";
		String str1 = "EFGH";
		// expected = DC
		System.out.println("First Case-->"+str.charAt(1)+str.charAt(2));
		System.out.println(str.compareTo(str1));
		System.out.println(str.concat(str1));
//		System.out.println(str.contains(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
	}

}
