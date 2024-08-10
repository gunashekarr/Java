/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package edifecs;

/**
 * @author 91895
 *
 */
public class Employee {
	
	private static String name;
	
	Employee(int id, String name,int age,boolean isActive)
	{
      this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName()
	{
		this.name=name;
	}

}
