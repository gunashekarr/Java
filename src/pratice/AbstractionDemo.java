/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

/**
 * @author 91895
 *
 */
interface test
{
	int a =10;
	default void method()
	{
		System.out.println("Default Method");
	}
	static void method1()
	{
		System.out.println("Static Method");
	}
	void method2();

}

public class AbstractionDemo {

	public static void main(String[] args) {
		testing ab = new testing();
		ab.method2();
		
		test ab1 = new testing();
	    ab1.method2();	
	}
	

}

class testing implements test
{
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method implementation!!");
		
	}
}