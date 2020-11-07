package classExercise;

public class PolyAnimal {
	public static void main(String[] args) {
		Animal[] ani = new Animal[2];
		ani[0] = new Elephant(5, 180, "Amy");
		ani[1] = new Animal(6, 60);
		
		for(int i = 0; i < ani.length; i++) {
			ani[i].speak();
		}
		
	}
}
