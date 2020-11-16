package homework;

public class Pencil extends Pen{
	
	public Pencil(){}
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() * 0.8;
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("削鉛筆再寫");
	}

}
