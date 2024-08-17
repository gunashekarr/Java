/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package basic;

/**
 * @author 91895
 *
 */
public class ConditionalStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//If Condition
		
		int a = 100;
		if(a>10)
		{
			System.out.println("if condition is passed");
		}
		
		//If Else Condition
		if(a>111)
		{
			System.out.println("if condition is passed");
		}
		else
		{
			System.out.println("else condition is passed");
		}
		
		//Else If Statement
		int number = 25;

        if (number > 30) {
            System.out.println("The number is greater than 30.");
        } else if (number > 20) {
            System.out.println("The number is greater than 20 but less than or equal to 30.");
        } else if (number > 10) {
            System.out.println("The number is greater than 10 but less than or equal to 20.");
        } else {
            System.out.println("The number is 10 or less.");
        }
        
        // Nested If Else statement
        int number1=29;
        if(number1>0)
        {
        	if(number1>10 && number1<20)
        	{
        		System.out.println("The number is greater than 10 and lesser than 20");
        	}
        	else if(number1>20 && number1<30)
        	{
        		System.out.println("The number is greater than 20 and lesser than 30");
        	}
        	else
        	{
        		System.out.println("The number is greater than 30");
        	}
        	
        }
        else
        {
        	System.out.println("The entered number is invalid");
        }
        
        //Switch Statement
        int num=3;
        switch(num)
        {
        case 1 : System.out.println("1 is the number"); break;
        case 2 : System.out.println("2 is the number"); break;
        case 3 : System.out.println("3 is the number"); break;
        case 4 : System.out.println("4 is the number"); break;
        case 5 : System.out.println("5 is the number"); break;
        }
	}

}
