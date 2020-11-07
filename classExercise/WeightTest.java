package classExercise;

public class WeightTest {
	public static void main(String[] args) {
		IWeightable[] aa = new IWeightable[3];
		aa[0] = new Dog("KUONG", 65);
		aa[1] = new Plane("PPAP", 600);
		aa[2] = new Powder("White", 20);
		
		for(int i = 0; i < aa.length; i++) {
			aa[i].getWeightMethod();
		}
	}
}
