/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package basic;

/**
 * @author 91895
 * Break used in switch & conditional statements
 */
public class JumpingStatements {
	public static void main(String[] args) {
		
		//-------------------------------------Break Statement------------------------------------------
		System.out.println("Break Statement");
		for (int i = 0; i <= 10; i++) 
		{
			if(i==7)
			{
				System.out.println(i);
				break;
			}
		}
		//-------------------------------------Continue Statement------------------------------------------
		System.out.println("Continue Statement");
		for (int i = 0; i <= 10; i++) 
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
