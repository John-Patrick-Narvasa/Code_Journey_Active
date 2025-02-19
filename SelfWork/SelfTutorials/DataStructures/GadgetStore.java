import java.util.HashMap;

public class GadgetStore {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("Laptop", 800);
        prices.put("Phone", 500);
        System.out.println("Laptop Price: $" + prices.get("Laptop"));
    }
}