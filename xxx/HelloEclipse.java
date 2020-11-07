package xxx;

import java.util.Scanner;

public class HelloEclipse {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);		
		int digit = 0;
		int num = sc.nextInt();
		 
		int tmp = num;
		while(tmp % 10 != 0) {
			tmp /= 10;
			digit++;
		}
		//System.out.println(digit);
		
		int front = 0;
		int back = 0;
		
		tmp = num;
		for(int i = (digit / 2) - 1; i >= 0 ; i--) {
			if(tmp % 0 == 0) {
				tmp /= 10;
				}
			front += (tmp % 10) * (int)Math.pow(10, i);
			tmp /= 10;
		}
		
		tmp = num;
		for(int i = 0; i < (digit / 2) + 1; i++) {
			tmp /= 10;
		}
		back = tmp;
		
		System.out.println(front + " " +  back);
		
		sc.close();
	}
}


