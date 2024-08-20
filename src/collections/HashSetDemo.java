/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edifecs.Employee;

/**
 * @author 91895
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		
		//Declaration - Hetrogenous data/item/object
		ArrayList myList = new ArrayList();
		List myList2 = new ArrayList();
		
		//Declaration - Homogenous data/item/object
		ArrayList<Integer> myList3 = new ArrayList<Integer>();
		ArrayList<String> myList4 = new ArrayList<String>();
		ArrayList<Employee> myList5 = new ArrayList<Employee>();
		
		//Adding data to arraylist
		myList.add(11);
		myList.add(11.11);
		myList.add("Guna");
		myList.add('G');
		myList.add(true);
		myList.add(null);
		myList.add(11);
		
		//Size of the arrayList
		System.out.println("Size of the arraylist : "+myList.size());
		
		//Print of the arrayList
		System.out.println("The arraylist : "+myList);
		
		//Inserting the data in between of the arrayList
		myList.add(2,"Gunashekar");
		System.out.println("The arraylist after inserting a new element: "+myList);
		
		//Modifying the data in the arrayList
		myList.set(2,"Gunashekar R");
		System.out.println("The arraylist after modifying a element: "+myList);
		
		//Remove element from arraylist
		myList.remove(2);
		System.out.println("The arraylist after removing an element: "+myList);
		
		//Access specific element from arraylist
        System.out.println("The arraylist element at position 1: "+myList.get(1));
        
        //Reading all the elements from the arrayList
        
        //Apprach 1 : Classic For Loop
        System.out.println("==============For Loop Output================");
        for (int i = 0; i < myList.size(); i++) {
        	System.out.println(myList.get(i));
		}
        
       //Apprach 2 : Advanced For Loop
        System.out.println("==============Advanced For Loop Output================");
        for (Object xx : myList) {
			System.out.println(xx);
		}
        
       //Apprach 3 : Iterator
        System.out.println("==============Iterator Loop Output================");
       Iterator it=myList.iterator();
       
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       
       // Checking the arrayList is empty or not
       System.out.println("Is the arraylist is empty? "+myList.isEmpty());
       
       //Remove all elements from the list1 to list2
       ArrayList myList1 = new ArrayList();
       myList.add(11);
	   myList.add(null);
	   myList.add("Guna");	
	   
	   myList.removeAll(myList1);
	   System.out.println("The arraylist after removing the other arraylist elements: "+myList);
	   
	   //remove all the elements/clear
	   myList.clear();
	   System.out.println("Is arraylist empty?"+myList.isEmpty());
	   
	   
	}

}
