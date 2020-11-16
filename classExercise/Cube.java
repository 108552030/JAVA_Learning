package classExercise;

public class Cube {
	private double length;
	
	public Cube(double length) throws CubeException{
		setLength(length);
	}
	
	public void setLength(double length) throws CubeException{
		if(length <= 0) {
			throw new CubeException("wrong input(<0)");
		}
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getVolumn() {
		return length * length *length;
	}
}
