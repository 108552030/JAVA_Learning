package classExercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		do {
			set.add((int)((Math.random() * 49) + 1));
		}while(set.size() < 6);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
