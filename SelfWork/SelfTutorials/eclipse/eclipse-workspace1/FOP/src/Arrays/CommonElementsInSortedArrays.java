package Arrays;

import java.util.Scanner;

public class CommonElementsInSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the 1st array: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter size of the 2nd array: ");
        int size2 = scanner.nextInt();
        System.out.print("Enter size of the 3rd array: ");
        int size3 = scanner.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] array3 = new int[size3];

        System.out.println("\nEnter value of the 1st array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter value of the 2nd array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }


        System.out.println("Enter value of the 3rd array: ");
        for (int i = 0; i < size3; i++) {
            array3[i] = scanner.nextInt();
        }

        System.out.println("\nOutput");
        System.out.println("Value of arrays:");
        System.out.print("Array1: ");
        printArray(array1);
        System.out.print("Array2: ");
        printArray(array2);
        System.out.print("Array3: ");
        printArray(array3);


        System.out.print("Common elements in sorted arrays: ");
        findCommonElements(array1, array2, array3);

        scanner.close();
    }

    private static void findCommonElements(int[] array1, int[] array2, int[] array3) {
        int i = 0, j = 0, k = 0;
        boolean foundCommon = false;

        while (i < array1.length && j < array2.length && k < array3.length) {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                System.out.print(array1[i] + " ");
                foundCommon = true;
                i++;
                j++;
                k++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array3[k]) {
                j++;
            } else {
                k++;
            }
        }

        if (!foundCommon) {
            System.out.print("None");
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
