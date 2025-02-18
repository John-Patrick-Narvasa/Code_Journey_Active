
import java.util.Scanner;
public class petShop {
    public class Pet extends petShop{
        private String name;
        private String breed;
        private String sound;
        private int price;

        public Pet(String name, String breed, String sound, int price) {
            this.name = name;
            this.breed = breed;
            this.sound = sound;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " the " + breed + " says " + sound + " and costs $" + price;
        }
    }

    public class Toy extends petShop{
        private String name;
        private String type;
        private int price;

        public Toy(String name, String type, int price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " the " + type + " costs $" + price;
        }
    }  

    public static void intro() {
        System.out.println("Welcome to the pet shop! Press enter to continue");
    }

    public static void choices() {
        System.out.println("What would you like to buy? ");
        System.out.println("1. Pet");
        System.out.println("2. Toy");
        System.out.println("3. Checkout");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        petShop petShop = new petShop();

        
        boolean shopping = true;
        intro();
        
        int total = 0;

        choices();

        while (shopping == true) {
            String choice = scan.nextLine();

            if (choice.equals("1")) {
                Pet dog = petShop.new Pet("Fido", "Dog", "Woof", 25);
                Pet cat = petShop.new Pet("Whiskers", "Cat", "Meow", 20);
                Pet bird = petShop.new Pet("Tweety", "Bird", "Tweet", 15);

                System.out.println("Choose a pet to buy\n");

                System.out.println("a. " + dog);
                System.out.println("b. " + cat);
                System.out.println("c. " + bird);

                if (choice.equals("a")) {
                    total += dog.price;
                }
                else if (choice.equals("b")) {
                    total += cat.price;
                }
                else if (choice.equals("c")) {
                    total += bird.price;
                }
                
            }
            else if (choice.equals("2")) {
                Toy bone = petShop.new Toy("Bone", "Bone", 5);
                Toy ball = petShop.new Toy("Ball", "Ball", 10);
                System.out.println("Choose a toy to buy\n");

                System.out.println("a. " + bone);
                System.out.println("b. " + ball);

                if (choice.equals("a")) {
                    total += bone.price;
                }
                else if (choice.equals("b")) {
                    total += ball.price;
                }
            }
            else if (choice.equals("4")) {
                System.out.println("Goodbye! :)");
                shopping = false;
                break;
            }
            else {
                System.out.println("Your total is $" + total);
            }
        }
        scan.close();
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
