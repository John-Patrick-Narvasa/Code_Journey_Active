package MathPatterns;

public class PrimeNum {
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
