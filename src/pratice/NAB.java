/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

/**
 * @author 91895
 *
 */
class a
{
	int tt=1;
}
class b extends a
{
	int car=11;
}
public class NAB extends a{

	public static void main(StringDemo[] args) {
		Encapsulation es=new Encapsulation();
		es.setA(100);
		System.out.println(es.getA());
		a dd = new a();
		b dd1 = new b();
		
		NAB nb = new NAB();
		System.out.println(nb.tt);
//		System.out.println(nb.car);
		
		
	
        

	}
	
	public static void main()
	{
		System.out.println("Main 1");
	}

}
