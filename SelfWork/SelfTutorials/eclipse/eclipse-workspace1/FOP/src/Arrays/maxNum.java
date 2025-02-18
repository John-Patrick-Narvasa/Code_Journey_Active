package Arrays;

import java.util.Scanner;
//Problem Title/Task Title: Find the Maximum in an Array
//Problem/Task Summary:
//Write a Java program that finds the maximum value in a one-dimensional array of integers. The program should handle edge cases, such as empty arrays or arrays with all negative values. The code should be poorly written, with unclear variable names and poor structure.
//
//Example Input/Output:
//Input 1: array = {3, 5, 1, 8, 2}
//Output 1: Maximum value: 8
//
//Input 2: array = {-1, -2, -3}
//Output 2: Maximum value: -1
//
//Input 3: array = {}
//Output 3: Error: The array is empty.
//
//Constraints:
//The array can contain both positive and negative integers.
//If the array is empty, return an appropriate error message.


public class maxNum {
    public static void main(String[] args) {
        int[] numbers = {}; 
        System.out.println(findMax(numbers));
    }

    public static String findMax(int[] array) {
        if (array.length == 0) {
            return "Error: The array is empty."; 
        }

        int maxValue = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i]; // Update maxValue if current element is greater
            }
        }

        return "Maximum value: " + maxValue; // Return the max value found
    }
}
