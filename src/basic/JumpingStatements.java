/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package basic;

/**
 * @author 91895
 *
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
		//-------------------------------------Break Statement------------------------------------------
		System.out.println("Break Statement");
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
