package homework;

public class HW4_6 {

	public static void main(String[] args) {
		//data setting
		byte[][] test = {	{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
							{ 37, 75, 77, 89, 64, 75, 70, 95 },
							{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
							{ 77, 95, 70, 89, 60, 75, 85, 89 },
							{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
							{ 90, 80, 100, 75, 50, 20, 99, 75 }};
		
		//use [9] array but not use [0] just [1]~[8] to count
		byte[] counter = { 0, 0 ,0 ,0 ,0 ,0 ,0 ,0, 0}; 
		
		//found the max of every test
		for(int i = 0; i < test.length; i++) {
			counter[max(test[i]) + 1]++;
		}

		//format output
		for(int i = 1; i < counter.length; i++ ) {
			System.out.println(i + "號：" + counter[i]);
		}
			
	}
	
	//found the max of the array
	public static byte max(byte[] arr) {
		byte max = arr[0];
		byte index = 0;
		for(byte i = 1;  i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	} 

}
