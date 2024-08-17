/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package basic;

/**
 * @author 91895
 *
 */
public class PrimitiveDatatype {
 public static void main(String[] args) 
 {
		// Primitive : Can hold only one value
	 
  // byte, short, int, long ------> number without decimal 
	 byte a = 120; // byte
	 System.out.println("A Value : "+ a);
	 
	 short b = 9999; // short
	 System.out.println("B Value : "+ b);
	 
	 int c = 99999; // int
	 System.out.println("C Value : "+ c);
	 
	 long d = 999999999999l; // long - Literal should be added at a end L/l
	 System.out.println("D Value : "+ d);
	 
   // float, double ------> decimal number
	 
	 float f = 99.99999f; // upto 7 decimals
	 System.out.println("F Value : "+ f);
	 
	 double e = 99.999999999999999; // upto 15 decimals
	 System.out.println("E Value : "+ e);
	 
   // char ------> single character (single quote)	 
	 
	 char j = 'G';
//	 char i = 'GU'; // CTE
//	 char k = "G"; // CTE
//	 String l = 'G'; // CTE
	 System.out.println("I Value-->"+j);
	 
  // boolean ---> true/false
	 
	 boolean flag = true;
	 boolean flag1 = false;
	 System.out.println(flag + " " + flag1);
	 
//	 boolean flag2 = "true"; // CTE 
//	 boolean flag3 = 'false'; // CTE
	 
	 
	 /*--->Primitive : Can hold only one value
	 byte, short, int, long ------> number without decimal
	 float, double ------> decimal number
	 char ------> single character (single quote)
	 boolean ---> true/false
	 */
	}

}
