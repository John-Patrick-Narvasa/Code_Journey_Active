Certainly! Here are three medium-level problems related to loops in Java, with the requested coverage, difficulty, and test types:

Problem 1: Palindrome Checker

Problem/Task Summary:
Write a program that checks whether a given string is a palindrome or not. A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward.

Example Input/Output:
Input: "racecar"
Output: true

Input: "Hello"
Output: false

Constraints:
- The input string can contain both uppercase and lowercase letters.
- The program should handle edge cases, such as empty strings or strings with only one character.
- The program should handle cases where the input string contains spaces or non-alphabetic characters.

Problem 2: Fibonacci Sequence Generator

Problem/Task Summary:
Write a program that generates the Fibonacci sequence up to a given number of terms. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.

Example Input/Output:
Input: 10
Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

Input: 5
Output: 0, 1, 1, 2, 3

Constraints:
- The program should handle negative input values and display an appropriate error message.
- The program should handle input values that result in very large Fibonacci numbers, which may cause integer overflow.
- The program should handle edge cases, such as a request for 0 or 1 Fibonacci term.

Problem 3: Nested Loop Pyramid Pattern

Problem/Task Summary:
Write a program that prints a pyramid-like pattern using nested loops. The pattern should be composed of numbers, and the number of rows should be determined by the user input.

Example Input/Output:
Input: 5
Output:
    1
   222
  33333
 4444444
555555555

Input: 3
Output:
  1
 222
33333

Constraints:
- The program should handle negative input values and display an appropriate error message.
- The program should handle input values that result in very large patterns, which may cause performance issues or output truncation.
- The program should handle edge cases, such as a request for 0 or 1 row.

Answers:

Problem 1: Palindrome Checker

```java
public static boolean isPalindrome(String str) {
    // Remove non-alphanumeric characters and convert to lowercase
    str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    // Check if the string is equal to its reverse
    return str.equals(new StringBuilder(str).reverse().toString());
}

public static void main(String[] args) {
    String input1 = "racecar";
    String input2 = "Hello";

    System.out.println("Racecar is a palindrome: " + isPalindrome(input1));
    System.out.println("Hello is a palindrome: " + isPalindrome(input2));
}
```

Problem 2: Fibonacci Sequence Generator

```java
public static void printFibonacci(int n) {
    if (n < 0) {
        System.out.println("Error: Input must be a non-negative integer.");
        return;
    }

    int a = 0, b = 1;
    System.out.print(a + ", " + b);

    for (int i = 2; i < n; i++) {
        int c = a + b;
        System.out.print(", " + c);
        a = b;
        b = c;
    }
    System.out.println();
}

public static void main(String[] args) {
    printFibonacci(10);
    printFibonacci(5);
}
```

Problem 3: Nested Loop Pyramid Pattern

```java
public static void printPyramid(int rows) {
    if (rows < 1) {
        System.out.println("Error: Number of rows must be a positive integer.");
        return;
    }

    for (int i = 1; i <= rows; i++) {
        // Print leading spaces
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }

        // Print the row
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print(i);
        }

        System.out.println();
    }
}

public static void main(String[] args) {
    printPyramid(5);
    printPyramid(3);
}
```