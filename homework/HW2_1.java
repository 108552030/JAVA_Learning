package homework;

public class HW2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		//while loop by %
		while(i <= 1000) {
			if(i % 2 == 0) {
				sum += i;		
			}
			i++;
		}
		System.out.println(sum);
		//initial value
		sum = 0;
		//for loop by add 2
		for(i = 2; i <= 1000; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
