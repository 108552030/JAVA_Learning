package homework.HomeWorkExt;

public class SuperPowerMove {
	//create a variable to catch the object which has implements Superable
	private Superable superable;
	
	//use Superable console to control object
	public void setSuberable(Superable superable) {
		this.superable = superable;
	}
	
	public Superable getSuperable() {
		return superable;
	}
	
	//same method but different implements define in interface to let others 
	//do it's own
	public void attack() {
		superable.attack();
	}
	
	//same method put in here
	public void move() {
		System.out.println("跑步");
	}

	public void defend() {
		System.out.println("做防禦動作");
	}
}
