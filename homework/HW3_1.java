package homework;

import java.util.Scanner;

public class HW3_1 {
	
	public static void main(String[] args) {
		//about input section, use Scanner API
		//輸入的部分
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		System.out.println("請輸入三個整數:");
		for(int i = 0; i < nums.length; i++) {
			if(sc.hasNextInt()) {
				nums[i] = sc.nextInt();
			}
		}
		
		//Check the input value is a triangle
		//檢查是否為三角形
		if(isTriangle(nums[0], nums[1], nums[2])) {
			//Confirm triangle type
			//判別三角形的類別
			if(nums[0] == nums[1] && nums[1] == nums[2]) {
				System.out.println("正三角形");
			}else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]){
				System.out.println("等腰三角形");
			}else {
				System.out.println("其他三角形");
			}		
		}else {
			System.out.println("不是三角形");
		}
		
		sc.close();
	}
	
	public static boolean isTriangle(int x, int y, int z) {
		
		//first. determine whether it is a triangle
		//a + b > c, b + c > a, a + c > b
		//a > |b - c|, b > |a - c|, c > |a - b|
		//a, b, c != 0
		//以公式的方式去確認輸入是否正確
		if((x * y * z) > 0) {
			if(x + y > z && x + z > z && y + z > x) {
				if(x > Math.abs(y - z) && y > Math.abs(x - z) && 
						z > Math.abs(y - x)) {
					//System.out.println("三角形");
					return true;
				}
			}
		}	
		return false;
	}


}
