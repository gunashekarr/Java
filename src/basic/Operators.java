package basic;

public class Operators {

	public static void main(String[] args) {
		
		
		//1) Arithmetic operators    + - * / %

		int a=20, b=10;

		int result=a+b;
		System.out.println("Sum of a and b is:"+result);
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo division of a and b is:"+(a%b));


		//2) Relational/comparison operators   >  >=  <  <=  !=  ==
		// returns boolean value - true/false

		System.out.println(a>b);  //true
		System.out.println(a<b);  //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		b=20;
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		boolean res = a>b;
		System.out.println(res);
		
		//3) Logical operators    &&  ||  !
		// returns boolean value - true/false
		// works between 2 boolean values

		boolean x=true;
		boolean y=false;

		System.out.println(x && y);  //false
		System.out.println(x || y);  //true
		System.out.println(!x);      //false
		System.out.println(!y);      //true

		boolean b1=10>20;
		System.out.println(b1);      //false

		boolean b2=20>10;
		System.out.println(b2);      //true

		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
        
		System.out.println("Boolean Operations");
		System.out.println((10<20) && (10<20)); // true
		System.out.println((10<20)||(40<20)); // true
		
		// 4.1) Increment operator
		
		//Case-1
		int j = 100;
		j++; // j=j+1;
		System.out.println("J Value after increment : "+j);
		
		//case2 - post increment
		int k=10;
		int res2=k++;
		System.out.println(res2); //10
		System.out.println(k); //11


		//case 3 - pre increment
		int l=10;
		int res1=++l;
		System.out.println(res1); //11
		System.out.println(l); //11
		
		// 4.2) Decrement operator
		
		//Case-1
		int m = 100;
		m--; // j=j-1;
		System.out.println("M Value after increment : "+m);
				
		//case2 - post decrement
		int n=100;
		int res6=n--;
		System.out.println(res6); //10
		System.out.println(n); //9

		//case 3 - pre decrement
		int o=100;
		int res7=--o;
		System.out.println(res7); //9
		System.out.println(o); //9
		
		//5) Assignment Operators = , += , -= , /= , %=
		
		//case1
		int p = 10;
		p+=5; // p=p+5;
		System.out.println("P Value : "+p);
		
		//Case2
		int q = 10;
		q-=5; // q=q-5;
		System.out.println("Q Value : "+q);
		
		//Case3
		int r = 10;
		r/=5; // r=r/5;
		System.out.println("R Value : "+r);
		
		//Case4
		int s = 10;
		s%=5; // s=s%5;
		System.out.println("S Value : "+s);
		
		//6) Ternary Opertor
		
		//var=exp ? result1 : result2;

		//Example1
		int t = 200, u = 100;
		int v = (t<u) ? t : u;
		System.out.println(v);

		//Example2
		int w = (1 == 1) ? 200 : 100;
		System.out.println(w);
		
		//Example3
		int person_age=30;
		String result1=(person_age>18)?"Eligible":"Not Eligible";
		System.out.println(result1);

	}

}
