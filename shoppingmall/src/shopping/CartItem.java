package shopping;

public class CartItem<T extends Product> {
	private T product;
	private int quantity; // 수량
	
	public CartItem(T product, int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	
	public T getProduct() {
		return this.product;
	}
	
	@Override
	public String toString() {
		return product+", 수량 : "+quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
