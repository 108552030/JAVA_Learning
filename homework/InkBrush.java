package homework;

public class InkBrush extends Pen{
	public InkBrush() {}
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() * 0.9;
	}
	
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}
