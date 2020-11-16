package classExercise;

public class TestMyCubeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Cube cube = new Cube(32);
			System.out.println(cube.getVolumn());
		}catch(CubeException e) {
			//System.out.println("Wrong input");
			e.printStackTrace();
		}
		
		
	}

}
