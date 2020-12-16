package hw10;

import java.util.Scanner;

public class HW10_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = null;
		String year = "";
		String month = "";
		String day = "";
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.println("請輸入日期(年月日，例如:20110131):");
			str = sc.next();
			//
			if(str.matches("^\\d{4}[0-2]\\d[0-3]\\d$")) {
				year = str.substring(0, 4);
				month = str.substring(4, 6);
				day = str.substring(6);
				//use homework 4_5 leap year method and date validation method
				if(!isDate(year, month, day)) {
					System.out.println("日期格式不正確，請在輸入一次!");
					sc.nextLine();
					continue;
				}
				break;
			}else {
				System.out.println("日期格式不正確，請在輸入一次!");
				sc.nextLine();
			}
				
		}
		loop:
		while(true) {
			System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
			if(sc.hasNextInt()) {
				switch(sc.nextInt()) {
					case 1:
						System.out.printf("%s/%s/%s",year, month, day);
						break loop;
					case 2:
						System.out.printf("%s/%s/%s",month, day, year);
						break loop;
					case 3:
						System.out.printf("%s/%s/%s",day, month, year);
						break loop;
					default:
						System.out.println("數字格式不正確，請再輸入一次!");
						sc.next();
				}
			}
		}
		
		
		sc.close();
	}
	
	
	public static boolean isDate(String year, String month, String day) {
		
		byte[] monthsDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		int iyear = Integer.parseInt(year); 
		int	imonth = Integer.parseInt(month); 
		int iday = Integer.parseInt(day);

		//Avoid illegal input
		if(iyear * imonth * iday > 0) {
			if(imonth <= 12) {
				if(iday == 29 && imonth == 2) {
					if(isLeapYear(iyear)) {
						return true;
					}
				}else if(iday <= monthsDay[imonth]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//test of leap year
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
