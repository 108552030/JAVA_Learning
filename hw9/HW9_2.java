package hw9;

public class HW9_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeAccount ca = new ChangeAccount();
		Mommy mom = new Mommy(ca);
		Son son = new Son(ca);
		
		Thread t1 = new Thread(mom);
		Thread t2 = new Thread(son);
		
		t1.start();
		t2.start();
		
	}

}

class ChangeAccount {
	public int account = 0;
	
	synchronized public void deposit(int money) {
		while(account > 3000) {
			try {
				System.out.println("媽媽看到帳戶餘額超過3000，暫停匯款");
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		account += money;
		System.out.println("媽媽存了" + money + "，帳戶共有：" + account);	
		notify();
	}
	
	synchronized public void withdraw(int money) {
		while(account < 1000) {
			try {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		account -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + account);	
		if(account < 2000) {
			System.out.println("熊大看到帳戶餘額在2000以下，要求匯款");
			notify();
		}
		
	}
}

class Mommy extends Thread{
	ChangeAccount ca;
	public Mommy(ChangeAccount ca) {
		this.ca = ca;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			ca.deposit(1000);
		}
	}
	
}

class Son extends Thread{
	ChangeAccount ca;
	public Son(ChangeAccount ca) {
		this.ca = ca;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			ca.withdraw(1000);
		}
	}
	
}