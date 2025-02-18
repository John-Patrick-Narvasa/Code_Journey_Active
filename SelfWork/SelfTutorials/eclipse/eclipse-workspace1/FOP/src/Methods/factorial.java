package Methods;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
        System.out.print("Enter a non negative integer: ");
        int number = scan.nextInt();
        System.out.println("Input: " + number);
        int factorial = factorial(number);
        System.out.println("Output: " + factorial);
        scan.close();
    }   

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else if (n < 0) {
            return 0;
        }
        else {
            int factorial = n * (factorial(n-1));
            return factorial;
        }
    }
}
