package homework;

public class HW2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte counter = 0;
		
		for(int i = 1; i <= 49; i++) {
			int tmp = i;
			while(tmp != 0) {
				if (tmp % 10 == 4 ) {
					break;
				}else {
					tmp /= 10;
				}		
				if(tmp == 0) {
					counter++;
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("\n" + counter + " 個");
	}

}
