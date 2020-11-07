package classExercise;

public class TestNineNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for - while
		int j = 1;
		for(int i = 1; i <= 9; i++) {
			while(j <= 9){
				System.out.print(j + "x" + i + "=" + i*j + "\t");
				j++;
			}
			System.out.println();
			j = 1;
		}
		System.out.println();
		
		
		//for - do while
		j = 1;
		
		for(int i = 1; i <= 9; i++){
			do {
				System.out.print(j + "x" + i + "=" + i*j + "\t");
				j++;
			}while(j <= 9);
			j = 1;
			System.out.println();
		}
		
		System.out.println();
		
		//while - do while
		int i = 1;
		j = 1;
		while(i <= 9) {
			do {
				System.out.print(j + "x" + i + "=" + i*j + "\t");
				j++;
			}while(j <= 9);
			j = 1;
			i++;
			System.out.println();
		}
	}

}
