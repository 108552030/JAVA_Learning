package classExercise;

public class Animal {
	private int age;
	private float weight;
	
	public Animal(int age, float weight){
		setAge(age);
		setWeight(weight);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public void speak() {
		System.out.println("年紀：" + getAge());
		System.out.println("體重：" + getWeight());
	}
	
	

}
