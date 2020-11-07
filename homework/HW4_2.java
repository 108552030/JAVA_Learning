package homework;

public class HW4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//use stringbuilder api to reverse string 
		String s = "Hello World";
		StringBuilder str = new StringBuilder(s);
		
		str = str.reverse();
		
		System.out.println(str);
	}

}
