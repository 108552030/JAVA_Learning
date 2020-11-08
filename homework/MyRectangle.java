package homework;

public class MyRectangle {
	private double width;
	private double depth;
	
	public MyRectangle() {
	
	}
	
	public MyRectangle(double width, double depth) {
		setWidth(width);
		setDepth(depth);
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width * depth;
	}
}
