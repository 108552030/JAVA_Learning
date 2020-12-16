package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class HW8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();
		array.add(new Integer(100));
		array.add(new Double(3.14));
		array.add(new Long(21L));
		array.add(new Short("100"));
		array.add(new Double(5.1));
		array.add("kitty");
		array.add(new Integer(100));
		array.add(new Object());
		array.add("Snoopy");
		array.add(new BigInteger("1000"));
		
		//Iterator mode
		System.out.println("==============================Iterator============================");
		Iterator it = array.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//normal for loop
		System.out.println("\n==============================For Loop============================");
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
		
		//for each loop
		System.out.println("\n==============================For Each============================");
		
		for(Object obj : array ) {
			System.out.print(obj + " ");
		}
		System.out.println("\n");
		
		/*	delete numeric object from Back to front avoid some element didn't catch
		 *	When remove, the array size will change, if from 0 to size() will skip 
		 *	some value
		 */
		for(int i = array.size()-1; i >= 0 ; i--){
			if(array.get(i) instanceof Number) {
				array.remove(i);
			}
		}
		System.out.println("\n==============================Delete Number============================");
		//display answer 
		for(Object obj : array ) {
			System.out.printf("%s ", obj.toString());
		}
	}
}