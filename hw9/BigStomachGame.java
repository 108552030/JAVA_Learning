package hw9;

import java.io.IOException;

public class BigStomachGame extends Thread{
	private String name;
	private int count;
	
	public BigStomachGame(String name) {
		this.name = name;
		count = 1;
	}
	
	@Override
	public void run() {
		while(count <= 10) {
			System.out.printf("%s吃第%d碗飯\n", name, count);
			count++;
			try {
				Thread.sleep((int)((Math.random() * 2499) + 500));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了!");
	}
	
}