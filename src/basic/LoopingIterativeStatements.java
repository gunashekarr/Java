package basic;

public class LoopingIterativeStatements {

	public static void main(String[] args) {
		
		// while loop
		
		// Example 1 : print the numbers from 1 to 10
		System.out.println("Example 1 : print the numbers from 1 to 10");
		int i = 1;      // Initialization
		while(i<=10)     // Condition
		{
			System.out.println(i);
			i++;        // Increment
		}
		
		// Example 2 : print the hello message 10 times
		System.out.println("// Example 2 : print the hello message 10 times");
		int i1 = 1;      // Initialization
		while(i1<=10)     // Condition
		{
			System.out.println("Hello");
			i1++;        // Increment
		}
		
		// Example 3 : print even numbers between 1 to 10
		System.out.println("// Example 3 : print even numbers between 1 to 10");
		int k=2;
		while(k<=10) 
		{
			System.out.println(k);	
			k+=2;
		}	
				
		// Example 4 : print even numbers between 1 to 10
		System.out.println("// Example 4 : print even numbers between 1 to 10");
		int j=1;
		while(j<=10) 
		{
			if(j%2==0)
			{
			System.out.println(j);	
			}
			j++;
		}
		
		// Example 5: print the numbers from 10 to 1 
		System.out.println("Example 5 : print the numbers from 10 to 1 in descending order");
		int i2 = 10;      
		while(i2>0)     
		{
			System.out.println(i2);
			i2--;        
		}
		
		//-------------------------------------Do while loop------------------------------------------
		System.out.println("Do-While loop");
		int num = 1;
		do
		{
			System.out.println(num);
			num++;
		}
		while(num<=10);
		
		int num1 = 10;
		do
		{
			System.out.println(num);
			num1--;
		}
		while(num1>0);
		
		//-------------------------------------For loop------------------------------------------
		System.out.println("For loop");
		
		//Example1 : 1.....10
		for (int l = 1; l <=10; l++) {
			System.out.println(l);
		}
		
		//Example2 : even numbers between 1 to 10
		for(int k1=2;k1<=10;k1+=2)
		{
			System.out.println(k1);
		}
			
		//Example3 : even & odd numbers between 1 to 10
		for (int l1 = 1; l1 <=10; l1++) {
			if(l1%2==0)
			{
				System.out.println(l1+" is a even number");
			}
			else
			{
				System.out.println(l1+" is a odd number");
			}
		}
		//-------------------------------------For Each loop------------------------------------------
				System.out.println("For Each loop");
				int[] values= {1,2,3,4,5};
				for(int value:values)
				{
					System.out.println(value);
				}
		
		
		
	}

}
