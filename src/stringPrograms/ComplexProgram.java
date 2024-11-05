/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

/**
 * @author 91895
 *
 */
public class ComplexProgram {
	public static void main(String[] args) {
		String str1 = "a2b3c4";
		String str2 = "2a3b4c";
		stringConversion1(str1);
		stringConversion2(str2);
	}
	// a2b3c4 : aabbbcccc
	public static void stringConversion1(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			if(Character.isAlphabetic(input.charAt(i)))
			{
				System.out.print(input.charAt(i));
			}
			else 
			{
				int x = Character.getNumericValue(input.charAt(i));
				for (int j = 1; j < x; j++) {
					System.out.print(input.charAt(i-1));
				}
			}
		}
	}
	
	
	// 2a3b4c : aabbbcccc
		public static void stringConversion2(String input)
		{
			StringBuilder output = new StringBuilder();
			
			for(int i=0;i<input.length();i++)
			{ 
				if(Character.isDigit(input.charAt(i)))
				{
					int count = Character.getNumericValue(input.charAt(i));
					char ch = input.charAt(i+1);
					
					for(int j=1;j<=count;j++)
					{
						output.append(ch);
					}
					i++;
				}
				
			}
			
			System.out.print("Converted String : "+ output.toString());
			
		}

}
