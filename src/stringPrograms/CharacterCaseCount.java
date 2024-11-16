/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

/**
 * @author 91895
 *
 */
public class CharacterCaseCount {
	public static void main(String[] args) {
		String input = "$GunaShekarR$";
		StringBuilder upperCase = new StringBuilder();
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder specialCase = new StringBuilder();
		int count1=0,count2=0,count3=0;
		
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperCase.append(ch);
				count1++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerCase.append(ch);
				count2++;
			}
			else
			{
				specialCase.append(ch);
				count3++;
			}
		}
		
		System.out.println("UpperCase: "+upperCase.toString()+" : "+count1);
		System.out.println("UpperCase: "+lowerCase.toString()+" : "+count2);
		System.out.println("UpperCase: "+specialCase.toString()+" : "+count3);

		
	}

}
