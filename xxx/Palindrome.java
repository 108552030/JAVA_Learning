package xxx;

public class Palindrome {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = -12321;
		//count digit
		int tmp = nums;
		int counter = 0;
		while(tmp != 0) {
			tmp = tmp / 10;
			counter++;
		}
		System.out.println(counter);
		//set front & back to check Palindrome number
		int front = 0;
		int back = 0;
		tmp = nums;
		for(int i = 1; i <= (counter / 2); i++) {
			back += (tmp % 10) * Math.pow(10, (counter/2) - i);
			tmp /= 10;
		}
		
		tmp = nums;
		for(int i = 0; i < ((counter + 1) / 2); i++) {
			tmp /= 10;
		}
		front = tmp;
		
		System.out.println(front + " " + back);
	}

}
 