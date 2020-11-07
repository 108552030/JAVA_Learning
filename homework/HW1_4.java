package homework;

public class HW1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final  float PI = 3.1415f;
		float radius = 5.0f;
		float circleArea = 0.0f;
		float circumference = 0.0f;
		
		circleArea = (radius * radius) * PI;
		circumference = radius * 2 * PI;
		
		System.out.println("Area = " + circleArea + "\tcircumference = " + circumference);
	}

}
