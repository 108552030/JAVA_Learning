package xxx;

import java.util.Enumeration;
import java.util.Hashtable;

public class TwoSun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 19;
		Integer[] nums = new Integer[10];
		for (int i = 9; i >= 0; i--) {
			nums[i] = new Integer((int) (Math.random() * 10 + 1));
		}

		Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			numbers.put( new Integer(nums[i]), new Integer(i));
		}
		
		for(int i = 0 ; i < nums.length; i++) {
			int tmp = target - nums[i];
			if(numbers.containsKey(tmp) && numbers.get(tmp) != i) {
				System.out.println(tmp + " " + numbers.get(tmp));
				break;
			}
		}
		System.out.println("Didn't match!");

	}
}
