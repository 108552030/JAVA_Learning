package homework;


public class HW1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FV = PV(1+i)^n
		int presentValue = 1_500_000;
		int n = 10;
		double interest = 0.02;
		double futureValue = 0.0;
		
		futureValue = presentValue * Math.pow(1 + interest, n);
		
		System.out.println("Future Value = " + futureValue);
		
		
		
	}

}
