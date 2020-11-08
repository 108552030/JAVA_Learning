package homework;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		HW5 obj1 = new HW5();
		//Homework 5_1
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高");
		obj1.starSquare(sc.nextInt(), sc.nextInt());
		
		System.out.println("==============================");

		//Homework 5_2
		obj1.randAvg();
		
		System.out.println("==============================");
		
		//Homework 5_3
		int[][] intArray = {{1, 6, 3},
							{9, 5, 2}};
		double[][] doubleArray = {	{1.2, 3.5, 2.2},
									{7.4, 2.1, 8.2}};
		
		System.out.println(obj1.maxElement(intArray));
		System.out.println(obj1.maxElement(doubleArray));
		
		System.out.println("==============================");
		
		//Homework 5_5
		System.out.println(obj1.genAuthCode());
		
		
		sc.close();
		
	}
	
	//Homework 5_1 method
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//Homework 5_2 method
	public void randAvg() {
		int average = 0;
		int sum = 0;
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);
			System.out.print(nums[i] + " ");
			sum += nums[i];
		}
		System.out.println();
		average = sum / nums.length;
		System.out.println(average);
	}
	
	//Homework 5_3 method
	public int maxElement(int x[][]) {
		int max = x[0][0];
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	public double maxElement(double x[][]) {
		double max = x[0][0];
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	////Homework 5_5 method
	public String genAuthCode() {
		char[] authCode= new char[8];
		byte[] randNum = new byte[8];
		//random 8 numbers to choice character
		for(int i = 0; i < randNum.length; i++) {
			randNum[i]=(byte)(Math.random() * 62);
			//System.out.print(randNum[i] + " ");
		}
//		System.out.println();
		//set a inner list 0-9 ->(char)0-9, 10-35 ->(char)A-Z, 36-61 -> (char)a-z
		//purpose：Save memory
		for(int i = 0; i < 8; i++) {
			if(randNum[i] >= 0 && randNum[i] <= 9) {
				authCode[i] = (char)(randNum[i] + 48);
			}else if(randNum[i] >= 10 && randNum[i] <= 35) {
				authCode[i] = (char)(randNum[i] + 55);
			}else if(randNum[i] >= 36 && randNum[i] <= 61) {
				authCode[i] = (char)(randNum[i] + 61);
			}
		}
		
		return new String(authCode);
	} 

}
