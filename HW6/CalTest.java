package HW6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		int x = 0, y = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("請輸入X的值:");
				x = scanner.nextInt();
				System.out.println("請輸入Y的值:");
				y = scanner.nextInt();				
				System.out.println((long)cal.powerXY(x, y));
				break;
			}catch(CalException e){
				System.out.println(e.getMessage());
			}catch(InputMismatchException e) {
				scanner.nextLine();
				System.out.println("輸入格式不正確");
			}
		}while(true);
		
		scanner.close();
	}

}
