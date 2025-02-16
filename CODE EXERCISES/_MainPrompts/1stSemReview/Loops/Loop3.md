Here’s a **Java-based loop exercise set** with **15 items** covering **while**, **for**, **do-while**, **nested loops**, and **loops with conditions**. The difficulty is set to **medium**, and the test types include **Multiple Choice**, **True or False**, **Problem Solving**, **Code Simulation**, **Code Reading**, **Program Enhancement and Debugging**, and **Exercise/App or Program Building**. Edge cases and poorly written code are included for added challenge.

---

### **Problem Title/Task Title: Java Loop Mastery**

---

### **Problem/Task Summary:**
This exercise set will test your ability to work with loops in Java. You will solve problems involving edge cases, debug poorly written code, and write programs to demonstrate your understanding of loops and their applications.

---

### **Quiz Items:**

#### **Multiple Choice Questions (1-3):**

1. **What is the output of the following code?**
   ```java
   int i = 0;
   while (i < 3) {
       System.out.print(i + " ");
       i++;
   }
   ```
   a) 0 1 2  
   b) 1 2 3  
   c) 0 1 2 3  
   d) 1 2  

2. **Which loop will execute at least once, even if the condition is false initially?**  
   a) `for` loop  
   b) `while` loop  
   c) `do-while` loop  
   d) None of the above  

3. **What is the purpose of the `break` statement in a loop?**  
   a) Skip the current iteration  
   b) Exit the loop entirely  
   c) Restart the loop  
   d) None of the above  

---

#### **True or False (4-5):**

4. **The following code will print numbers from 1 to 10:**
   ```java
   int i = 1;
   while (i <= 10) {
       System.out.println(i);
   }
   ```
   a) True  
   b) False  

5. **The `continue` statement skips the remaining code in the loop and moves to the next iteration.**  
   a) True  
   b) False  

---

#### **Problem Solving (6-7):**

6. **Write a Java program to print the first 10 natural numbers using a `for` loop.**

7. **Write a Java program to print the sum of all odd numbers between 1 and 20 using a `while` loop.**

---

#### **Code Simulation (8-9):**

8. **What is the output of the following code?**
   ```java
   for (int i = 1; i <= 5; i++) {
       if (i % 2 == 0) {
           System.out.print(i + " ");
       }
   }
   ```

9. **What is the output of the following code?**
   ```java
   int i = 5;
   do {
       System.out.print(i + " ");
       i--;
   } while (i > 0);
   ```

---

#### **Code Reading (10-11):**

10. **What is the output of the following poorly written code?**
    ```java
    int a = 0, b = 1;
    while (a < 10) {
        System.out.print(a + " ");
        b = a + b;
        a = b - a;
    }
    ```

11. **What is the output of the following poorly written code?**
    ```java
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(i * j + " ");
        }
    }
    ```

---

#### **Program Enhancement and Debugging (12-13):**

12. **Debug the following code to print numbers from 10 to 1 in reverse order:**
    ```java
    int i = 10;
    while (i > 0) {
        System.out.println(i);
    }
    ```

13. **Enhance the following code to print only multiples of 3 between 1 and 20:**
    ```java
    for (int i = 1; i <= 20; i++) {
        System.out.println(i);
    }
    ```

---

#### **Exercise/App or Program Building (14-15):**

14. **Write a Java program to print the following pattern using nested loops:**
    ```
    *
    **
    ***
    ****
    *****
    ```

15. **Write a Java program to print all prime numbers between 1 and 50 using nested loops and conditions.**

---

### **Constraints:**
- Use proper indentation and syntax.
- Ensure the program runs without errors.
- Follow the problem requirements strictly.

---

### **Example Input/Output:**

#### Example 1:
**Input:**  
Program for Question 6: Print first 10 natural numbers.  
**Output:**  
1 2 3 4 5 6 7 8 9 10  

#### Example 2:
**Input:**  
Program for Question 14: Print a pattern.  
**Output:**  
```
*
**
***
****
*****
```

---

### **Answers:**

1. a) 0 1 2  
2. c) `do-while` loop  
3. b) Exit the loop entirely  
4. b) False  
5. a) True  

6. **Program:**
   ```java
   for (int i = 1; i <= 10; i++) {
       System.out.print(i + " ");
   }
   ```

7. **Program:**
   ```java
   int sum = 0;
   int i = 1;
   while (i <= 20) {
       if (i % 2 != 0) {
           sum += i;
       }
       i++;
   }
   System.out.println(sum);
   ```

8. **Output:**  
   2 4  

9. **Output:**  
   5 4 3 2 1  

10. **Output:**  
    0 1 1 2 3 5 8  

11. **Output:**  
    0 0 0 1 0 2  

12. **Debugged Code:**
    ```java
    int i = 10;
    while (i > 0) {
        System.out.println(i);
        i--;
    }
    ```

13. **Enhanced Code:**
    ```java
    for (int i = 1; i <= 20; i++) {
        if (i % 3 == 0) {
            System.out.println(i);
        }
    }
    ```

14. **Program:**
    ```java
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```

15. **Program:**
    ```java
    for (int num = 1; num <= 50; num++) {
        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    ```

---

Let me know if you’d like me to continue or expand on any part!