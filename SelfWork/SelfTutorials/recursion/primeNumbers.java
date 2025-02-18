import java.util.Scanner;

public class primeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Confirm(scan);
    }
    public static void Confirm(Scanner scan) {

        System.out.print("Enter a non negative integer: ");
        int number = scan.nextInt();
        System.out.println("Input: " + number);
        boolean isPrime = isPrime(number);
        System.out.println("Output: " + isPrime);
    }

    public static boolean isPrime(int n) {
		if (n == 2 || n ==3 || n == 5 || n == 7) {
			return true;
    	}
		else if (n == 1 || n % 2 == 0 || n % 3 == 0 || n % 4 == 0 || n % 5 == 0 || n % 6 == 0 || n % 7 == 0 || n % 8 == 0 || n % 9 == 0) {
			return false;
		}
    	else {
    		return true;
    	}
    }

	public static void allPrime(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime numbers between 1 and " + number + " are: ");
        allPrimeRange(number); // using the other method
        scanner.close();
    }

    public static void allPrimeRange(int n) {
        int i = 1;

        for (i = 1 + 1; i <= n; i++) {
            if (i == 2 || i ==3 || i == 5 || i == 7) {
                System.out.print(i + " ");
            }
            else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }   
        }
    }
}