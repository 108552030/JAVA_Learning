package homework;

public class HW1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5 + 5);
		//integer add integer get integer
		System.out.println(5 +'5');
		/*	character also store as a integer,so compiler think it is a 
		 * 	normal addition problem
		 */	
		System.out.println(5 + "5");
		/*	When complier saw the string object ,it change the addition's 
		 *	function into append mode
		 */
	}

}
