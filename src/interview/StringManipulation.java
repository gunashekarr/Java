/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package interview;

/**
 * @author 91895
 *
 */
public class StringManipulation {
	public static void main(String[] args) {
		String input1="a2b3c2";
		String input2="2a3b4c";
		alphaNumber(input1);
		numberAplha(input2);
		System.out.println("Executed!!");

	}
	
	
	// 2a3b4c
	public static void numberAplha(String input1) {
		for(int i=0;i>input1.length();i++)
		{
			if(Character.isDigit(input1.charAt(i)))
			{
				int count = Character.getNumericValue(input1.charAt(i));
				char ch = input1.charAt(i+1);
				System.out.println("count : "+count);
				
				for (int j = 1; j < count; j++) {
					System.out.println(ch);
					j++;
				}
			}
			
		}
		
		System.out.println("numberAplha executed");
		
	}
	
	// input=a2b3c2
	public static void alphaNumber(String input)
	{
		for(int i=0;i>input.length();i++)
		{
			if(Character.isAlphabetic(input.charAt(i)))
			{
				System.out.print(input.charAt(i));
			}
			else if(Character.isDigit(input.charAt(i)))
			{
				int count = Character.getNumericValue(input.charAt(i));
				for (int j = 1; j < count; j++) {
					System.out.print(input.charAt(i));
				}
			}
		}
		
	}

}
