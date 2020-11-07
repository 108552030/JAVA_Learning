package homework;

import java.util.Scanner;

public class HW3_3 {

	public static void main(String[] args) {
		//create a array to ensure that the number can be use
		boolean [] data = new boolean[50];
		for(int i = 1; i < data.length; i++) {
			 data[i] = true;
		}
		//input 1-9 to check the number 
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭的數字？(1 ~ 9)：");
		if(sc.hasNextInt()) {
			int deleteNum = sc.nextInt();
			if(deleteNum < 10 && deleteNum > 0) {
				
				for(int i = 1; i <= 49; i++) {
					int tmp = i;
					while(tmp != 0) {
						if (tmp % 10 == deleteNum ) {
							data[i] = false;
							break;
						}else {
							tmp /= 10;
						}
					}
				}	
			}else {
				System.out.println("需介於1~9之間！");
			}
		}else {
			System.out.println("需為整數！");
		}	
		System.out.println();
		
		//display the result that he can choose
		int counter = 0;
		for(int i = 1; i < 50; i++) {
			if(data[i]) {
				counter++;
				System.out.print(i + "\t");
				if(counter % 6 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("總共有" + counter + "數字可以選");
		
		System.out.println();
		
		//random choose 6 number
		counter = 0;
		int choiceNum;
		System.out.print("電腦選號：");
		while(counter != 6) {
			choiceNum = (int)(Math.random() * 49) + 1;
			if(data[choiceNum]) {
				System.out.print(choiceNum + "\t");
				counter++;
			}
		}
	sc.close();
	}

}