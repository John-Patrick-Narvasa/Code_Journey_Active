
import java.util.Scanner;

public class petShop {
	// THE STORE WOOF WOOF!!! meow uwu AWA
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	// Available Pets
    	Pet pet1 = new Pet("Bilo", "Dog", "Woof", 25);
    	Pet pet2 = new Pet("Oggy", "Cat", "Meow", 20);
    	
    	//Available secret items
    	Basement secret1 = new Basement("GigaChad", "Mogger", "Mewing", 1_000);
    	Basement secret2 = new Basement("Slave", "Cotton Picker", "Nigger", 1);
    	
    	// Available Toys
    	Toy toy1 = new Toy("Bone", 5);
    	Toy toy2 = new Toy("Ball", 10);
    	Toy toy3 = new Toy("Frisbee", 5);
    	Toy toy4 = new Toy("Yarn", 8);
    	Toy toy5 = new Toy("Catnip (drugs)", 30);
    	Toy toy6 = new Toy("Cotton", 1);
    	Toy toy7 = new Toy("Bugatti", 69);

    	
    	// Available Foods
    	Food food1 = new Food("Dog Food", "Beef Steak", 50);
    	Food food2 = new Food("Dog Food", "Chicken", 30);
    	Food food3 = new Food("Cat Food", "Salmon", 40);
    	Food food4 = new Food("Cat Food", "Tuna", 45);
    	Food food5 = new Food("Slave Food", "Watermelon", 2);
    	Food food6 = new Food("Chad Food", "Protein Powder", 500);
    	
    	int total = 0;
    	System.out.println("Welcome to pet shop! Press enter to continue");
    	scan.nextLine();
    	while (true) {
    		System.out.println("\nWhat would you like to buy?\n");
    		System.out.println(
    				"1. Pet \n"
    				+ "2. Toy \n"
    				+ "3. Food \n"
    				+ "4. Secret? \n"
    				+ "5. Checkout \n"
    				+ "6. Exit"
    				);
    		String choice = scan.nextLine();
    		
    		switch (choice) {
    		case "1":
    			System.out.println("Choose a pet to buy: ");
    			System.out.println("a. " + pet1);
    			System.out.println("b. " + pet2);
    			
    			String petChoice = scan.nextLine().toLowerCase();
    			 if (petChoice.equals("a")) {
	   				 System.out.println(pet1.name + " purchased!");
    				 total += pet1.getPrice();
    			 } 
    			 else if (petChoice.equals("b")) {
	   				 System.out.println(pet2.name + " purchased!");
    				 total += pet2.getPrice();
    			 } 
                 else { 
                	 System.out.println("Invalid choice.");
                 }
    			break;
    		case "2":
    			System.out.println("Choose a toy to buy: ");
    			System.out.println("a. " + toy1);
    			System.out.println("b. " + toy2);
    			System.out.println("c. " + toy3);
    			System.out.println("d. " + toy4);
    			System.out.println("e. " + toy5);
    			System.out.println("f. " + toy6);
    			System.out.println("g. " + toy7);
    			
    			String toyChoice = scan.nextLine();
	   			 if (toyChoice.equals("a")) {
	   				 System.out.println(toy1.name + " purchased!");
					 total += toy1.getPrice();
				 } 
				 else if (toyChoice.equals("b")) {
	   				 System.out.println(toy2.name + " purchased!");
					 total += toy2.getPrice();
				 } 
				 else if (toyChoice.equals("c")) {
	   				 System.out.println(toy3.name + " purchased!");
					 total += toy3.getPrice();
				 } 
				 else if (toyChoice.equals("d")) {
	   				 System.out.println(toy4.name + " purchased!");
					 total += toy4.getPrice();
				 } 
				 else if (toyChoice.equals("e")) {
	   				 System.out.println(toy5.name + " purchased!");
					 total += toy5.getPrice();
				 } 
				 else if (toyChoice.equals("f")) {
	   				 System.out.println(toy6.name + " purchased!");
					 total += toy6.getPrice();
				 } 
				 else if (toyChoice.equals("g")) {
	   				 System.out.println(toy7.name + " purchased!");
					 total += toy7.getPrice();
				 } 
	             else { 
	            	 System.out.println("Invalid choice.");
	             }
    			break;
    		case "3":
    			System.out.println("Choose a food to buy: ");
    			System.out.println("a. " + food1);
    			System.out.println("b. " + food2);
    			System.out.println("c. " + food3);
    			System.out.println("d. " + food4);
    			System.out.println("e. " + food5);
    			System.out.println("f. " + food6);
    			
    			String foodChoice = scan.nextLine();
	   			 if (foodChoice.equals("a")) {
	   				 System.out.println(food1.name + " purchased!");
					 total += food1.getPrice();
				 } 
				 else if (foodChoice.equals("b")) {
	   				 System.out.println(food2.name + " purchased!");
					 total += food2.getPrice();
				 } 
				 else if (foodChoice.equals("c")) {
	   				 System.out.println(food3.name + " purchased!");
					 total += food3.getPrice();
				 } 
				 else if (foodChoice.equals("d")) {
	   				 System.out.println(food4.name + " purchased!");
					 total += food4.getPrice();
				 } 
				 else if (foodChoice.equals("e")) {
	   				 System.out.println(food5.name + " purchased!");
					 total += food5.getPrice();
				 } 
				 else if (foodChoice.equals("f")) {
	   				 System.out.println(food6.name + " purchased!");
					 total += food6.getPrice();
				 } 
	             else { 
	            	 System.out.println("Invalid choice.");
	             }
    			break;
    		case "4":
    			System.out.println("Choose a secret item to buy: ");
    			System.out.println("a. " + secret1);
    			System.out.println("b. " + secret2);
    			
    			String secretChoice = scan.nextLine();
	   			 if (secretChoice.equals("a")) {
	   				 System.out.println(secret1.name + " purchased!");
					 total += secret1.getPrice();
				 } 
				 else if (secretChoice.equals("b")) {
	   				 System.out.println(secret2.name + " purchased!");
					 total += secret2.getPrice();
				 } 
	             else { 
	            	 System.out.println("Invalid choice.");
	             }
    			break;
    		case "5":
    			System.out.println("Your total is $" + total);
                break;
    		case "6":
    			System.out.println("Goodbye! :)");
                scan.close();
                return;
    		default: 
    			 System.out.println("Invalid choice. Try again.");
    			 
            	}
    		}
    	}
    }
	// classes boo
	class Pet {
		final String name;
		private final String breed;
		private final String sound;
		private final int price;
		// constructors
		public Pet(String name, String breed, String sound, int price) {
			this.name = name;
			this.breed = breed;
			this.sound = sound;
			this.price = price;
		}
		
		public int getPrice() {
			return price;
		}
		
		public String toString() {
			return name + " the " + breed + " says " + sound + " and costs $" + price;
		}
		
	}
	
	
	class Toy {
		final String name;
		private final int price;
		
		// constructors
		public Toy(String name, int price) {
			this.name = name;
			this.price = price;
		}
		
		public int getPrice() {
			return price;
		}
		
		public String toString() {
			return name + " costs $" + price;
		}
	}
	
	class Food {
		final String name;
		private final String flavor;
		private final int price;
		
		// constructors
		public Food(String name, String flavor, int price) {
			this.name = name;
			this.flavor = flavor;
			this.price = price;
		}
		
		public int getPrice() {
			return price;
		}
		
		public String toString() {
			return name + ", with a " + flavor + " costs $" + price;
		}
	}
	
	class Basement {
		final String name;
		private final String breed;
		private final String sound;
		private final int price;
		// constructors
		public Basement(String name, String breed, String sound, int price) {
			this.name = name;
			this.breed = breed;
			this.sound = sound;
			this.price = price;
		}
		
		public int getPrice() {
			return price;
		}
		
		public String toString() {
			return name + " the " + breed + " says " + sound + " and costs $" + price;
		}
	}





/*

declare scan class
declare the petShop class

intro method

choice method

main method
    intro method
    while loop with condition
        exit script 
        choices method
            array of choices
            choice script (buy, check or exit)
        price counter

    final price

    outro method
 */