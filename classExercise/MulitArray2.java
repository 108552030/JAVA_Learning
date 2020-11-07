package classExercise;


public class MulitArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] x = getRandomArray();
		int[][] y = getRandomArray();
		
		int[][] z = addArray(x, y);
		
		displayArray(x);
		displayArray(y);
		displayArray(z);
		
	}


	public static int[][] getRandomArray() {
		int[][] arr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 31);
			}
		}
		return arr;
	}
	
	public static int[][] addArray(int[][] arr1, int [][]arr2 ){
		int[][] arr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return arr;
	}
	
	public static void displayArray(int[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=====================");
	}
}