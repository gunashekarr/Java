/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

/**
 * @author 91895
 * Method Overriding
 */
class parent
{
	public void home()
	{
		System.out.println("old home");
	}
}
class child extends parent
{
	public void home()
	{
		//super keyword
		super.home();
		System.out.println("New home");
	}
}

public class MethodOverriding {
	
	public static void main(StringDemo[] args) {
		child cc = new child();
		cc.home();
//		parent pp = new parent();
//		pp.home();
//		
//		parent pp1 = new child();
//		pp1.home();
		

	}
	
	

}
