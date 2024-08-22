/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package basic;

/**
 * @author 91895
 *
 */
	class Bank{
		double roi() {
			return 1 ;
		}
	}

	class ICICI extends Bank
	{
		double roi() {
			return 10.5;
		}
	}

	class SBI extends Bank
	{
		double roi() {
			System.out.println(super.roi());
			return 11.5;
		}
	}


	public class MethodOverRiding {

		public static void main(String[] args) {
			
			SBI sbobj = new SBI();
			System.out.println(sbobj.roi());

		}

	}



