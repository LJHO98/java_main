package shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<CartItem<? extends Product>> list = new ArrayList<>();
	
	public <T extends Product> void addCart(T cart, int quantity) {
		CartItem<T> ct = new CartItem<>(cart, quantity);
		list.add(ct);
	}
	
	public void showCart() {
		for(CartItem<? extends Product> cart: list) {
			System.out.println(cart);
		}
	}
}
