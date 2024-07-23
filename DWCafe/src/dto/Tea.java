package dto;

public class Tea {
	private int price;
	private String itemName;
	
	public Tea(String itemName, int price) {
		this.price = price;
		this.itemName = itemName;
	}
	
	@Override 
	public String toString() {
		return itemName+", "+price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	
	
	
}
