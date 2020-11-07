package classExercise;

public class MulitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);
				y[i][j] = (int) (Math.random() * 31);
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
	}

}
