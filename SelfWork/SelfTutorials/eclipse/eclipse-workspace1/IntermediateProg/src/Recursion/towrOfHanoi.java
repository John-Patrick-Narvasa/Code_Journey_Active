package Recursion;

public class towrOfHanoi {
	public static void solveTheMystery(int n, char x, char y, char z) {
		if (n == 1) {
			System.out.println();
			System.out.println("Disk 1 moves from " + x + " to " + z);
		}
		else {
			solveTheMystery(n - 1, x, z, y);
			System.out.println("Disk " + n + " moves from " + x + " to " + z);
			solveTheMystery(n - 1, y, x, z);
		}
	}
	public static void main(String[] args) {
		int num = 4;
		solveTheMystery(num, 'A', 'B', 'C');
	}
}
