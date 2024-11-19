/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package interview;

/**
 * @author 91895
 *
 */
public class ReverseNumber {
	public static void main(String[] args) {
		int num=121;
		reverseNumber(num);
	}
	
	public static void reverseNumber(int num)
	{
		int orgNum=num;
		int rev = 0;
		while(orgNum!=0)
		{
			int digit = orgNum%10;
			rev = rev*10+digit;
			orgNum=orgNum/10;
		}
		System.out.println("Reverse of the number : "+orgNum);
	}

}
