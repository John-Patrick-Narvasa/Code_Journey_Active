Here’s a set of **5 problems** based on your requirements. The problems cover **Methods in Java** with a focus on **Problem Solving, Program Enhancement and Debugging, and Program Building**. The difficulty is **Easy**, and the problems include edge cases and poorly written code for added challenge.

---

### **Problem 1: Problem Solving**
**Title:** Calculate Factorial Using a Method  
**Summary:** Write a Java method called `factorial` that takes an integer `n` as input and returns its factorial. Use this method in the `main` method to calculate and print the factorial of a given number.  

**Example Input/Output 1:**  
Input: `5`  
Output: `120`  

**Example Input/Output 2:**  
Input: `0`  
Output: `1`  

**Constraints:**  
- The input `n` will be a non-negative integer.  
- Handle edge cases like `n = 0` and `n = 1`.  

---

### **Problem 2: Program Enhancement and Debugging**
**Title:** Fix the Method  
**Summary:** The following Java method is supposed to return the sum of two numbers, but it has a logical error. Fix the code.  

```java
public static int sum(int a, int b) {
    return a - b; // Error here
}
```

**Example Input/Output 1:**  
Input: `3, 5`  
Output: `8`  

**Example Input/Output 2:**  
Input: `-2, 2`  
Output: `0`  

**Constraints:**  
- The method should correctly return the sum of `a` and `b`.  

---

### **Problem 3: Program Building**
**Title:** Check if a Number is Prime  
**Summary:** Write a Java method called `isPrime` that takes an integer `n` as input and returns `true` if the number is prime and `false` otherwise. Use this method in the `main` method to check if a given number is prime.  

**Example Input/Output 1:**  
Input: `7`  
Output: `true`  

**Example Input/Output 2:**  
Input: `10`  
Output: `false`  

**Constraints:**  
- The input `n` will be a positive integer greater than 1.  
- Handle edge cases like `n = 2` (the smallest prime number).  

---

### **Problem 4: Problem Solving**
**Title:** Find the Maximum of Three Numbers  
**Summary:** Write a Java method called `findMax` that takes three integers as input and returns the maximum of the three. Use this method in the `main` method to find and print the maximum of three given numbers.  

**Example Input/Output 1:**  
Input: `3, 7, 5`  
Output: `7`  

**Example Input/Output 2:**  
Input: `-1, -5, -3`  
Output: `-1`  

**Constraints:**  
- The method should handle negative numbers and duplicates.  

---

### **Problem 5: Program Enhancement and Debugging**
**Title:** Fix the Poorly Written Code  
**Summary:** The following Java code is poorly written and contains errors. Fix the code to make it functional and readable. The method `printMessage` should print a message `n` times.  

```java
public class Main {
    public static void printMessage(String msg, int n) {
        for (int i = 0; i <= n; i++) { // Error here
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        printMessage("Hello", 3);
    }
}
```

**Example Input/Output 1:**  
Input: `"Hello", 3`  
Output:  
```
Hello
Hello
Hello
```

**Example Input/Output 2:**  
Input: `"Java", 2`  
Output:  
```
Java
Java
```

**Constraints:**  
- Fix the loop condition to print the message exactly `n` times.  
- Ensure the method is readable and properly formatted.  

---

### **Answers:**

1. **Factorial Method Solution:**  
   ```java
   public class Main {
       public static int factorial(int n) {
           if (n == 0 || n == 1) {
               return 1;
           }
           int result = 1;
           for (int i = 2; i <= n; i++) {
               result *= i;
           }
           return result;
       }

       public static void main(String[] args) {
           int n = 5;
           System.out.println(factorial(n)); // Output: 120
       }
   }
   ```

2. **Sum Method Fix:**  
   ```java
   public static int sum(int a, int b) {
       return a + b; // Fixed
   }
   ```

3. **Prime Check Method Solution:**  
   ```java
   public class Main {
       public static boolean isPrime(int n) {
           if (n <= 1) {
               return false;
           }
           for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   return false;
               }
           }
           return true;
       }

       public static void main(String[] args) {
           int n = 7;
           System.out.println(isPrime(n)); // Output: true
       }
   }
   ```

4. **Maximum of Three Numbers Solution:**  
   ```java
   public class Main {
       public static int findMax(int a, int b, int c) {
           return Math.max(a, Math.max(b, c));
       }

       public static void main(String[] args) {
           int a = 3, b = 7, c = 5;
           System.out.println(findMax(a, b, c)); // Output: 7
       }
   }
   ```

5. **Fix Poorly Written Code Solution:**  
   ```java
   public class Main {
       public static void printMessage(String msg, int n) {
           for (int i = 0; i < n; i++) { // Fixed loop condition
               System.out.println(msg);
           }
       }

       public static void main(String[] args) {
           printMessage("Hello", 3);
       }
   }
   ```

Let me know if you'd like me to continue or add more problems!