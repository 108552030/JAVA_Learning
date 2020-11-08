package homework;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle rec1 = new MyRectangle();
		rec1.setWidth(10.0);
		rec1.setDepth(20.0);
		System.out.println(rec1.getArea());
		
		MyRectangle rec2 = new MyRectangle(10.0, 20.0);
		System.out.println(rec2.getArea());
	}

}
