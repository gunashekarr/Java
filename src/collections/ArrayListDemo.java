/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import edifecs.Employee;

/**
 * @author 91895
 *
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		
		//Declaration - Hetrogenous data/item/object
		HashSet mySet = new HashSet();
		Set mySet1 = new HashSet();
		
		//Declaration - Homogenous data/item/object
		HashSet<Integer> mySet2= new HashSet<Integer>();
		HashSet<String> mySet3 = new HashSet<String>();
		HashSet<Employee> mySet4 = new HashSet<Employee>();
		
		//Adding data to arraylist
		mySet.add(11);
		mySet.add(12);
		mySet.add(11.11);
		mySet.add("Guna");
		mySet.add('G');
		mySet.add(true);
		mySet.add(null);
		mySet.add(11);
		mySet.add(null);
		
		//Size of the HashSet
		System.out.println("Size of the arraylist : "+mySet.size());
		
		//Print of the HashSet
		System.out.println("The arraylist : "+mySet);
		
		//Inserting the data in between of the HashSet - Not Possible
		System.out.println("Inserting the data in between of the HashSet - Not Possible");
		
		//Modifying the data in the HashSet
		System.out.println("Modifying the data in between of the HashSet - Not Possible");
		
		//Remove element from HashSet
		mySet.remove(12);
		System.out.println("The arraylist after removing an element: "+mySet);
		
		//Access specific element from HashSet - Not Possible
        System.out.println("Access specific element from HashSet - Not Possible");
        
        // Using workaround we can access the elements - convert to ArrayList
        System.out.println("Access specific element from HashSet - With Workaround");
        ArrayList al = new ArrayList(mySet);
        System.out.println(al.get(1));
        System.out.println(al);
        
        //Reading all the elements from the HashSet
        
        //Apprach 1 : Classic For Loop
        System.out.println("==============For Loop Output - Not Possible due to indexing not available================");
  
        
       //Apprach 2 : Advanced For Loop
        System.out.println("==============Advanced For Loop Output================");
        for (Object xx : mySet) {
			System.out.println(xx);
		}
        
       //Apprach 3 : Iterator
        System.out.println("==============Iterator Loop Output================");
       Iterator it=mySet.iterator();
       
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       
       // Checking the arrayList is empty or not
       System.out.println("Is the arraylist is empty? "+mySet.isEmpty());
       
       //Remove all elements from the list1 to list2
//       HashSet mySet1 = new HashSet();;
//       mySet1.add(11);
//       mySet1.add(null);
//       mySet1.add("Guna");	
//	   
//	   mySet.removeAll(mySet1);
//	   System.out.println("The arraylist after removing the other arraylist elements: "+mySet1);
	   
	   //remove all the elements/clear
	   mySet1.clear();
	   System.out.println("Is arraylist empty?"+mySet1.isEmpty());
	   
	   
	}

}
