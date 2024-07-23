package shopping;

public class Mall {

	public static void main(String[] args) {
		Electronics elec = new Electronics("E12001", "≥√¿Â∞Ì", 1702000, "ªÔº∫");
		Clothing clt = new Clothing("C12032", "πŸ¡ˆ", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(elec, 3);
		shop.addCart(clt, 2);
		
		shop.showCart();

	}

}
