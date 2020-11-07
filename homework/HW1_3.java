package homework;

public class HW1_3 {
	public static void main(String[] args) {
		int day, hour, min, sec;
		int num = 256559;
		
		sec = num % 60;
		num /= 60;
		min = num % 60;
		num /= 60;
		hour = num % 24;
		num /= 24;
		day = num;
		
		System.out.print(day + " day ");
		System.out.print(hour + " hour ");
		System.out.print(min + " minute ");
		System.out.println(sec + " second");
	}
}
