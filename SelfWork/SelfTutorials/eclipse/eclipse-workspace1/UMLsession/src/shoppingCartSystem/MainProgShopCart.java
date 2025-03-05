package shoppingCartSystem;

public class MainProgShopCart {
	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		cart1.addItem(new Item("Banana", 0.95, 2));
		cart1.displayCart();
	}
}
