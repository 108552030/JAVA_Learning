package homework;

public class HW2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//'A' -> 65
		for(int i = 1; i <= 6; i++) {
			for(int j = 0;j < i ; j++) {
				System.out.printf("%c", 65 +(i - 1));
			}
			System.out.println();
		}
	}
}
