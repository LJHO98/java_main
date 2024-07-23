package shopping;

public class Clothing extends Product{
	private String size; // 옷사이즈
	
	public Clothing(String id, String name, int price, String size) {
		super(id,name,price);
		this.size = size;
	}
	
	@Override
	public String toString() {
		return super.toString()+", 사이즈 : "+ size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
