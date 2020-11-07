package homework;

import java.util.Scanner;

public class HW4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//months day table
		byte[] monthsDay = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		int year, month, day;
		int dayOfYear = 0;
		//input setting 
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入西元年、月、日 (以空白間隔)：");
		//Avoid illegal input
		while(true) {
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
			if(year * month * day > 0) {
				if(month <= 12) {
					if(day <= monthsDay[month]) {
						break;
					}else {
						System.out.println("日期不合法！");
					}
				}else {
					System.out.println("月份不合法！");
				}
			}else {
				System.out.println("日期不可為負數或零！");
			}
			
		}
		
		//if not leap year then February day 29 minus 1
		for(int i = 1; i < month; i++) {
			if( !(isLeapYear(year)) && i == 2) {
				dayOfYear--;
			}
			dayOfYear+=monthsDay[i];
		}
		dayOfYear += day;
		
		System.out.println("輸入的日期為該年第" + dayOfYear + "天");
	}
	
	//leap year tester
	public static boolean isLeapYear(int years) {
		if(years % 4 == 0 && years % 100 != 0) {
			return true;
		}else if(years / 400 == 0){
			return true;
		}else {
			return false;
		}
	}

}
