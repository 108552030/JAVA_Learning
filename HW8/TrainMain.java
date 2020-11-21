package HW8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainMain {

	public static void main(String[] args) {
		//Question  sorted Train 
		List<Train> list = new ArrayList<Train>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(list);
		
		//classic for loop
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		//foreach
		for(Object obj: list) {
			System.out.println(obj);
		}
		System.out.println();
		
		
		//Not repeating set
		Set<Train> set1 = new HashSet<Train>(list);
		
		//iterator version
		Iterator it2 = set1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println();
		
		//for each loop
		for(Object obj : set1) {
			System.out.println(obj);
		}
		System.out.println();
		
		//Sorted set , use treeSet
		Set<Train> set2 = new TreeSet<Train>(list);
		
		Iterator it3 = set2.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		System.out.println();
		
		//for each version
		for(Object obj : set2) {
			System.out.println(obj);
		}
		
	}

}
