package homework;

public class HW4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		float sum = 0;
		float average = 0.0f;
		
		//add every element in arr array
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		//use array data member length to calculate average
		average = sum / arr.length;
		
		System.out.println(average);
		
		//format output
		System.out.print("{");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > average) {
				if(i > 1) {
					System.out.print(", ");
				}
				System.out.print(arr[i]);
			}
		}
		System.out.println("}");
	}

}
