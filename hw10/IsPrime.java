package hw10;

import java.util.ArrayList;
import java.util.List;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(5);
		
		for(int i = 0; i < 5; i++) {
			//use Math.random to make 5 random number
			list.add((int)(Math.random() * 100 ) + 1);
			
			if(IsPrime.isPrime(list.get(i))) {
				System.out.println(list.get(i) + "是質數");
			}else {
				System.out.println(list.get(i) + "不是質數");
			}
		}
		
	}
	
	public static boolean isPrime(int number) {
		//0 and 1 is no a Prime number
		if(number == 1 || number == 0)return false;
		//only need to test square of the number to ensure is prime 
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}	
		return true;
	}
 
}
