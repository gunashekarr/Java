/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

import java.util.Arrays;

public class Methods {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Guna";
		String str2 = "Shekar";
		String str3 = "R";
		System.out.println("String--->"+str1);
		
		// Find the length
		System.out.println("Length-->"+str1.length());
		System.out.println("DirectLength-->"+"Guna".length());
		
		// Concat the string
		System.out.println("Simple Concat 2 string-->"+str1+str2);
		System.out.println("Concat 2 string using method-->"+str1.concat(str2));
		System.out.println("Simple Concat 3 string-->"+str1+str2+str3);
		System.out.println("Concat 3 string using method-->"+str1.concat(str2).concat(str3));
		
		System.out.println("Guna"+"Shekar");
		System.out.println("Guna".concat("Shekar"));
		
		// Trim  - Removes the right and left spaces
		String str4 = "   Guna   ";
		System.out.println("Before Trim-->"+str4);
		System.out.println("Length before trim-->"+str4.length());
		System.out.println("After Trim-->"+str4.trim());
		System.out.println("Length after trim-->"+str4.trim().length());
		
		//charAt() - returns a character from a string based on index
		String str5 = "Guna";
	    System.out.println("Last Character-->"+str5.charAt(3));
	    System.out.println("Last Character-->"+str5.charAt(0));
	    
	    //contains() - return true/false
	    String str6 = "Testing";
	    System.out.println(str6.contains("Test")); // true
	    System.out.println(str6.contains("test")); // false - case sensitive
	    System.out.println(str6.contains("tet")); // false - no sequence
	    
	    //equals() equalsIgnoreCase()
	    String str7 ="welcome";
	    String str8 ="welcome";
	    System.out.println(str7==str8); // true
	    System.out.println(str7.equals(str8)); //true - recommended
	    System.out.println(str7.equals("Welcome")); //  false
	    System.out.println(str7.equalsIgnoreCase(str8)); // true
	    System.out.println(str7.equalsIgnoreCase("Welcome")); // true
	    
	    //replace() - replace single/multiple(sequence) of characters in a string
	    String str9 = "Selenium java playwright Selenium Java Selenium";
	    System.out.println("String-->"+str9);
	    System.out.println("Replacing a S with G-->"+str9.replace('S','G'));
	    System.out.println("Replacing a Selenium with Guna-->"+str9.replace("Selenium","Guna"));
	    System.out.println("Replacing a Selenium with Guna and Guna with Test-->"+str9.replace("Selenium","Guna").replace("Guna","Test"));
	    String name = "Guna Shekar";
	    System.out.println(name.toLowerCase().contains("guna"));
	    System.out.println(name.replace('G','g').contains("guna"));
	    
	    // example $15,20,25 --> 152015
	    String amount = "$15,20,25"; // 15,20,25    
//	    System.out.println(amount.replace('$','')); // cant replace with empty in char hence using str below
	    System.out.println(amount.replace("$","").replace(",","")); // 152015
	    
	    //substring() - extracts only mentioned values
	    // substring(0,3) - start index starts from 0, end index starts from 1 
	    String str10 = "Welcome";
	    System.out.println(str10.substring(3)); // come
//	    System.out.println(str10.substring(9)); // java.lang.StringIndexOutOfBoundsException 
	    System.out.println(str10.substring(0,3)); // Wel
	    System.out.println(str10.substring(0,1)); // W
	    System.out.println(str10.substring(0,0)); // Null
//	    System.out.println(str10.substring(0,9)); // java.lang.StringIndexOutOfBoundsException 
	    
	    // upperCase and lowerCase
	   String str11 = "guna";
	   String str12 = "shekar";
	   System.out.println("Converted to upper case"+ "str11-->"+str11.toUpperCase());
	   System.out.println("Converted to upper case"+ "str11-->"+str11.toLowerCase());
	   
	   //Split() - you cannot use as delimeters
       String str13 = "guna@gmail.com";
       String[] s = str13.split("@");
       
       System.out.println(s); // location
       System.out.println(Arrays.toString(s)); // [guna, gmail.com]
       System.out.println(s[0]); // guna
       System.out.println(s[1]); // gmail.com
       
       // Example actual= abc,123@xyz expected = abc 123 xyz
       String str14 = "abc,123@xyz";
       
       String a[]=str14.split(",");
       System.out.println(Arrays.toString(a)); //  [abc, 123@xyz]
       
       String a1[]=a[1].split("@");
       System.out.println(Arrays.toString(a1)); //  [123, xyz]
       
       System.out.println(a[0]+a1[0]+a1[1]); // abc 123 xyz
       
       
       
	}

}
