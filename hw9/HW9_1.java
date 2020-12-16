package hw9;

public class HW9_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigStomachGame player1 = new BigStomachGame("饅頭人");
		BigStomachGame player2 = new BigStomachGame("詹姆士");
		//create two thread to run two object
		Thread t1 = new Thread(player1);
		Thread t2 = new Thread(player2);
		System.out.println("-----大胃王快食比賽開始!-----");
		//start the thread
		t2.start();
		t1.start();
		
		//make sure main wait the two thread 
		try{
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束!-----");
	}

}
