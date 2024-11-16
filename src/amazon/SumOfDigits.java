/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package amazon;

/**
 * @author 91895
 *
 */
public class SumOfDigits {
public static void main(String[] args) {
		int num = 1234;
		int sum=0,count=0;
		
		reverseNumber(num);
		
		while(num>0)
		{
			int digit = num%10;
			sum=sum+digit;
			num=num/10;
			count++;
		}
		System.out.println("The sum of the digits : "+ sum);
		System.out.println("The number of the digits : "+ count);
		
	}

public static void reverseNumber(int num)
{
	int rev=0;
	
	while(num>0)
	{
		int digit = num%10;
		rev=rev*10+digit;
		num=num/10;
	}
	
	System.out.println("Reversed Nummber : "+rev);
}

}
