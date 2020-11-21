package HW7;

import java.io.Serializable;

public class Dog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1687893761639745366L;
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
