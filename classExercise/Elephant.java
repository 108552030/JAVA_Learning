package classExercise;

public class Elephant extends Animal {
	private String name;
	//constructor
	Elephant(int age, float weight, String name){
		super(age, weight);
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void speak() {
		super.speak();
		System.out.println("名字：" + getName());
	}
	
	
}
