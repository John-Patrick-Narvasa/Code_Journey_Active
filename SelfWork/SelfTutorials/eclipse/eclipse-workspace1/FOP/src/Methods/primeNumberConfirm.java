package Methods;

import java.util.Scanner;

public class primeNumberConfirm {
	public static void main(String[] args) {
		prog();
    }

    public static void prog() {
    	Scanner scan = new Scanner (System.in);
        System.out.print("Enter a non negative integer: ");
        int number = scan.nextInt();
        System.out.println("Input: " + number);
        boolean isPrime = isPrime(number);
        System.out.println("Output: " + isPrime);
        scan.close();
    }
    

    public static boolean isPrime(int n) {
    	if (n == 1 || n % 2 == 0 || n % 3 == 0 || n % 4 == 0 || n % 5 == 0 || n % 6 == 0 || n % 7 == 0 || n % 8 == 0 || n % 9 == 0) {
    		return false;
    	}
    	else if (n == 2 || n ==3 || n == 5 || n == 7) {
    		return true;
    	}
    	else {
    		return true;
    	}
    }
}
