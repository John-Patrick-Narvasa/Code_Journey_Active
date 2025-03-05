package shoppingCartSystem;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
	private List<Item> items;
	
	
	public ShoppingCart() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(String itemName) {
		items.removeIf(item -> item.getName().equals(itemName));
	}
	
	public double calculateTotal() {
		double total = 0;
		for (Item item: items) {
			total += item.getTotalPrice();
		}
		return total;
	}
	
	public void displayCart() {
		System.out.println("Items in cart: ");
		
		for (Item item: items) {
			System.out.println(item.getName() + ": $" + item.getPrice() + " x " + item.getQuanti() + " = $" 
								+ item.getTotalPrice());
		}
	}
}
