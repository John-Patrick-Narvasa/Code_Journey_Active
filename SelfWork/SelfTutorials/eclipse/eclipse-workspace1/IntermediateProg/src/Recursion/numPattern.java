package Recursion;

public class numPattern {
	public static void main(String[] main) {
		printNumbers(1,6);
	}
	
	public static void printNumbers(int i, int j) {
		if (i > 6) {
			return;
		}
		else {
			System.out.print(i + "_" + j + "_");
			printNumbers(i + 1, j - 1);
		}
	}
}
