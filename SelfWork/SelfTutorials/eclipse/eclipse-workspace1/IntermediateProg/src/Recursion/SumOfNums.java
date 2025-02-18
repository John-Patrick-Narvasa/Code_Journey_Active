package Recursion;

public class SumOfNums {
	public static void main(String[] args) {
		int result;
		
		result = sum(10);
		System.out.print(result);
		
	}
	
	public static int sum(int number) {
		if (number > 0) {
			return number + sum(number - 1);
		}
		else {
			return 0;
		}
	}
}
