package xxx;

import java.util.Scanner;

public class test {
	public static void main(String[] args){
//		String regex = "^[A-Za-z][1-2]\\d{8}$";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Input your ID:");
//		String str = sc.next();
//		
//		if(str.matches(regex)) {
//			System.out.println("True");
//		}else {
//			System.out.println("False");
//		}
	
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.printf("%d\n", i, j);
//			}
//		}
//		String str = "";
//		
//		System.out.print(str);
//		System.out.println("1");

		test t = new test();
		try {
			t.doOne();
			t.doMore();
		}catch(Exception e) {
			System.out.println("Caught " + e);
		}
	
		
	}	
	public void  doOne() throws Exception {
		throw new RuntimeException();
	}
		
	public void doMore()throws Exception{
		throw new Error("Error");
	}

	
	
	
	

}
