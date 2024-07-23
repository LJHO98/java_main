package shopping;

public class Electronics extends Product{
	private String brand; // 브랜드
	
	public Electronics(String id, String name, int price, String brand) {
		super(id,name,price);
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return super.toString()+", 브랜드 : "+brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
