package math;

public class twoNumCalc {
	// as outputs
	public static void add(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}
	
	public static void sub(int x, int y) {
		int result = x - y;
		System.out.println(result);
	}
	
	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println(result);
	}
	
	public static void div(int x, int y) {
		int result = x / y;
		System.out.println(result);
	}
	
	public static void mod(int x, int y) {
		int result = x % y;
		System.out.println(result);
	}
	
	//as values
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static int diff(int x, int y) {
		return x - y;
	}
	
	public static int prod(int x, int y) {
		return x * y;
	}
	
	public static int quo(int x, int y) {
		return x / y;
	}
	
	public static int remainder(int x, int y) {
		return x % y;
	}
	
	
	// testing
	public static void main(String[] args) {
		mod(5,3);
	}
}
