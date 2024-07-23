package dto;

public class Coffe {
	private int price;
	private String itemName;
	private boolean deCaffein;
	
	public Coffe(String itemName, int price, boolean deCaffein) {
		this.price = price;
		this.itemName = itemName;
		this.deCaffein = deCaffein;
	}
	
	@Override 
	public String toString() {
		return itemName+"("+price+"원)"+(deCaffein?" 디카페인":"");
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
	public boolean isDeCaffein() {
		return deCaffein;
	}
	public void setDeCaffein(boolean deCaffein) {
		this.deCaffein = deCaffein;
	}
	
	
}
