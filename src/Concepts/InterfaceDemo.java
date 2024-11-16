/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package Concepts;

/**
 * @author 91895
 *
 */

interface animal
{
	int lionCount=11;
	void sound();
	
	default void lionSound()
	{
		System.out.println("Lion Sound!!");
	}
	
	static void tigerSound()
	{
		System.out.println("Tiger Sound!!");
	}
}

class cat implements animal{
	@Override
	public void sound() {
		System.out.println("Cat Sound!!");	
}

}

public class InterfaceDemo{
	
public void main(String[] args) {
	cat cc = new cat();
	cc.sound();
 }
}
