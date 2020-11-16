package homework.HomeWorkExt;

public class RoleGameTest {

	public static void main(String[] args) {
		SuperPowerMove saber = new SuperPowerMove();//("亞拉岡", 1, 0);
		SuperPowerMove archer = new SuperPowerMove();//("勒苟拉斯", 1, 0);
		
		saber.setSuberable(new SwordMan("亞拉岡", 1, 0));
		archer.setSuberable(new ArrowMan("勒苟拉斯", 1, 0));
		
		
		saber.attack();
		saber.move();
		
		archer.attack();
		archer.move();
	}

}
