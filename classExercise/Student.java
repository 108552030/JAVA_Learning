package classExercise;

public class Student {
	int score = 90;
	
	public void play(int hours) {
		score-=hours;
	}
	
	public void study(int hours ) {
		score+=hours;
	}
	
	public static void main(String[] args) {
		Student amy = new Student();
		
		amy.play(5);
		amy.study(10);
		
		System.out.println(amy.score);
	}
}
