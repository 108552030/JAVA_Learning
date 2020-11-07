package classExercise; 

public class Test4Numbers {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 100; i++){
			if(i % 4 == 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//Add 4 method
		for(int i = 0; i <= 100; i = i + 4)
			System.out.print(i + " ");
	}

}
