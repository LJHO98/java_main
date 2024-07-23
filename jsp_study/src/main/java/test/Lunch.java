package test;

public class Lunch {
	private String menu;
	private int price;
	private String restaurant;
	
	//public Lunch(String menu){} 이런식으로 생성자 메서드를 만들어버리면 기본 생성자 메서드가 사라져서 따로 만들어줘야된다.
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
}
