package MathPatterns;

public class MathPatterns {
	public static void main(String[] args) {
		PrimeNum.allPrimeRange(100);
		System.out.println();
		System.out.println(PrimeNum.isPrime(100));
		System.out.println(Fibonacci.number(10));
		
		int[] sequence = Fibonacci.sequence(10);
		for (int num: sequence) {
			System.out.print(num + " ");
		}
		System.out.println();
		Fibonacci.sequence2(7);
	}
}
