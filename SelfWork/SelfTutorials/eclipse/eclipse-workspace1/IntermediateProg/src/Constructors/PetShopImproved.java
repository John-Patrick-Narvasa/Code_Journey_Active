package Constructors;

import java.util.Scanner;

public class PetShopImproved {
	
	static abstract class Item {
	    String name;
	    int price;

	    public int getPrice() {
	        return price;
	    }

	    public String toString() {
	        return name + " ($" + price + ")";
	    }
	}
	
	static class Pet extends Item {
	    String type, sound;

	    Pet(String name, String type, String sound, int price) {
	        this.name = name;
	        this.type = type;
	        this.sound = sound;
	        this.price = price;
	    }
	}
	
	static class Toy extends Item {
	    Toy(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }
	}
	
	static class Food extends Item {
	    String category, flavor;

	    Food(String category, String flavor, int price) {
	        this.name = category + " - " + flavor;
	        this.category = category;
	        this.flavor = flavor;
	        this.price = price;
	    }
	}
	
	static class Basement extends Item {
	    String description, effect;

	    Basement(String name, String description, String effect, int price) {
	        this.name = name;
	        this.description = description;
	        this.effect = effect;
	        this.price = price;
	    }
	}
	
	
    public static <T extends Item> int purchaseItem(Scanner scan, T[] items, String itemType) {
        System.out.println("Choose a " + itemType + " to buy:");
        
        for (int i = 0; i < items.length; i++) {
            System.out.println((char) ('a' + i) + ". " + items[i]);
        }

        String itemChoice = scan.nextLine().toLowerCase();
        int index = itemChoice.charAt(0) - 'a';

        if (index >= 0 && index < items.length) {
            System.out.println(items[index].name + " purchased!");
            return items[index].getPrice();
        } else {
            System.out.println("Invalid choice.");
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int quantity = 0;

        // Available Pets
        Pet[] pets = {
            new Pet("Bilo", "Dog", "Woof", 25),
            new Pet("Oggy", "Cat", "Meow", 20)
        };

        // Available Toys
        Toy[] toys = {
            new Toy("Bone", 5),
            new Toy("Ball", 10),
            new Toy("Frisbee", 5),
            new Toy("Yarn", 8),
            new Toy("Catnip (drugs)", 30),
            new Toy("Cotton", 1),
            new Toy("Bugatti", 69)
        };

        // Available Foods
        Food[] foods = {
            new Food("Dog Food", "Beef Steak", 50),
            new Food("Dog Food", "Chicken", 30),
            new Food("Cat Food", "Salmon", 40),
            new Food("Cat Food", "Tuna", 45),
            new Food("Skibidi Food", "Toilet", 2),
            new Food("Chad Food", "Protein Powder", 500)
        };

        // Available Secret Items
        Basement[] secrets = {
            new Basement("GigaChad", "Mogger", "Mewing", 1_000),
            new Basement("Sigma", "Cotton Picker", "Skibidi", 1)
        };

        System.out.println("Welcome to the pet shop! Press enter to continue.");
        scan.nextLine();

        while (true) {
            System.out.println("\nWhat would you like to buy?");
            System.out.println("1. Pet\n2. Toy\n3. Food\n4. Secret?\n5. Checkout\n6. Exit");
            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    total += purchaseItem(scan, pets, "pet");
                    break;
                case "2":
                    total += purchaseItem(scan, toys, "toy");
                    break;
                case "3":
                    total += purchaseItem(scan, foods, "food");
                    break;
                case "4":
                    total += purchaseItem(scan, secrets, "secret item");
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
