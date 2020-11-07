package homework;

import java.util.Scanner;

public class HW4_4 {

	public static void main(String[] args) {
		//use 2-dimension array to store the data
		int[][] employee = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int loanAmount;
		int counter = 0;
		//input setting 
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入需要借得金額：");
		if (sc.hasNextInt()) {
			loanAmount = sc.nextInt();

			System.out.print("有錢可借的員工編號: ");
			for (int i = 0; i < employee.length; i++) {
				if (employee[i][1] >= loanAmount) {
					System.out.print(employee[i][0] + " ");
					counter++;
				}
			}
			System.out.println("共" + counter + "人!");
		}
		
		sc.close();

		// int [] isAbleToLoan;

	}

}