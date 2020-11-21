package HW7;

import java.io.Serializable;

public class Cat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4879830670000629949L;
	
	private String name;
	private int age;
	
	public Cat(String name) {
		this.name = name;
		this.age = 12;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
