package classExercise;

import java.io.*;
import java.util.Scanner;

public class TestBMI {

	public static void main(String[] args) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		float weight;
		float hight;
		float bmi = 0;
		System.out.print("Input your weight:");
		weight = scanner.nextFloat();
		System.out.print("Input your hight:");
		hight = scanner.nextFloat();
		//String text = buf.readLine()
		bmi = weight / ((hight/100) * (hight/100));
		System.out.println(String.format("%.2f", bmi ));
		if(bmi < 18.5) {
			System.out.println("Too thin!");
		}else if(bmi >=18.5 && bmi < 24) {
			System.out.println("Normal");
		}else {
			System.out.println("Too fat!");
		}
//		System.out.println(hight + "CM");
//		if()
		scanner.close();
	}
}
