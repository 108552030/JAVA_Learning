package homework;

import java.util.Scanner;

public class HW3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random() * 101);
		int guessNum = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("開始猜數字吧！");
			if(scanner.hasNextInt()) {
				guessNum = scanner.nextInt();
				if(guessNum > answer){
					System.out.println("太大！");
				}else if(guessNum < answer) {
					System.out.println("太小！");
				}else if(guessNum == answer) {
					System.out.println("答對了！答案就是 " + answer);
					break;
				}			
			}else {
				System.out.println("輸入錯誤！請重新輸入：");
				//clear the scanner buffer
				scanner.nextLine();
			}			
		}while(true);
		
		//System.out.println(answer);
		
	}

}
