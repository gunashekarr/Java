/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package collections;

/**
 * @author 91895
 *
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
public class HashMapDemo {
 
	public static void main(String[] args) {
		//Declaration
		HashMap map = new HashMap();
		Map mymap = new HashMap();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//Adding pairs
		hm.put(101,"John");
		hm.put(102, "Scott");
		hm.put(103, "Marry");
		hm.put(104, "Scott");
		hm.put(102, "David");
		System.out.println(hm);
		System.out.println("Size of hashmap "+hm.size());
		//remove pair
		hm.remove(103);
		System.out.println("After removing pair: "+hm);
		//access value of the key
		System.out.println(hm.get(102)); 
		//
		System.out.println("-------");
		//get all the keys from hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		//Reading data from hashmap
	//Using for each
		System.out.println("Try diff");
		for(Entry<Integer, String> x:hm.entrySet()) {
			System.out.println(x);
		}
		for(int x:hm.keySet()) {
			System.out.println("For Each Loop");
			System.out.println(x+"  "+hm.get(x));
		}
		//Using iterator
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		hm.clear();
		System.out.println(hm.isEmpty());



 
	}
 
}
