package MathPatterns;


import java.util.LinkedList;
import java.util.Scanner;

public class TowerOfHanoi {

    static LinkedList<Integer>[] pegs = new LinkedList[3];
    static int step = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number of discs: ");
        int n = scanner.nextInt();
        System.out.println("process: ");

        // Initialize pegs
        for (int i = 0; i < 3; i++) {
            pegs[i] = new LinkedList<>();
        }
        // Fill the first peg (A) with discs 1, 2, ..., n (top to bottom)
        for (int i = 1; i <= n; i++) {
            pegs[0].addFirst(i);
        }

        // Print initial state
        printState();

        // Solve Tower of Hanoi
        towerOfHanoi(n, 0, 1, 2);

        System.out.println("Puzzle of " + n + " discs complete:)");
        
        scanner.close();
    }

    public static void towerOfHanoi(int n, int source, int auxiliary, int destination) {
        if (n == 1) {
            moveAndPrint(source, destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, auxiliary);
        moveAndPrint(source, destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void moveAndPrint(int source, int destination) {
        int disc = pegs[source].removeFirst();
        pegs[destination].addFirst(disc);
        step++;
        System.out.println("Step " + step + ":");
        printState();
    }

    public static void printState() {
        // Determine the maximum height among the pegs
        int maxHeight = 0;
        for (LinkedList<Integer> peg : pegs) {
            if (peg.size() > maxHeight) {
                maxHeight = peg.size();
            }
        }

        // For each row from top to bottom
        for (int i = 0; i < maxHeight; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                LinkedList<Integer> peg = pegs[j];
                // Get the disc at the current row (from top)
                int index = peg.size() - maxHeight + i;
                if (index >= 0 && index < peg.size()) {
                    line.append(peg.get(index));
                } else {
                    line.append(" ");
                }
                // Add four spaces between columns
                if (j < 2) {
                    line.append("    ");
                }
            }
            // Print the line after trimming trailing spaces
            System.out.println(line.toString().replaceAll("\\s+$", ""));
        }
        System.out.println();
    }
}

