/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package pratice;

/**
 * @author 91895
 *
 */
public class Infosys {
int c,d;
Infosys(int a, int b)
{
 c=a;
 d=b;
}

public void add()
{
	System.out.println(c+d);
}
public void add(int k,int j)
{
	System.out.println(k+j);
}
public void add(double k,int j)
{
	System.out.println(k+j);
}
public void add(int k,double j)
{
	System.out.println(k+j);
}

public static void main(String[] args) {
	Infosys nw = new Infosys(10,10);
	nw.add();

}

}
