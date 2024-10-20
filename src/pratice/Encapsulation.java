/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

/**
 * @author 91895
 *
 */
public class Encapsulation {
	
	private int a;
	private int b;
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(StringDemo[] args) {
		Encapsulation es=new Encapsulation();
//		System.out.println("Before Setting an Value"+es.getA());
		es.setA(100);
		System.out.println(es.getA());

		
  
    

	}


	}

