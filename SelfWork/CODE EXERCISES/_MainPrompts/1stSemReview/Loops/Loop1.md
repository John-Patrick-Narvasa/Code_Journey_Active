Here’s a coding exercise problem set based on your requirements:

---

### **Problem Title/Task Title: Mastering Loops in Programming**

---

### **Problem/Task Summary:**
This exercise will test your understanding of loops (`while`, `for`, `do-while`), nested loops, and loops with conditions. You will solve multiple-choice questions, debug code, and write programs to demonstrate your skills.

---

### **Quiz Items:**

#### **Multiple Choice Questions (1-5):**

1. **What is the output of the following code?**
   ```python
   for i in range(3):
       print(i, end=" ")
   ```
   a) 0 1 2  
   b) 1 2 3  
   c) 0 1 2 3  
   d) 1 2  

2. **Which loop will always execute at least once?**  
   a) `for` loop  
   b) `while` loop  
   c) `do-while` loop  
   d) None of the above  

3. **What is the purpose of the `break` statement in a loop?**  
   a) Skip the current iteration  
   b) Exit the loop entirely  
   c) Restart the loop  
   d) None of the above  

4. **How many times will the following loop run?**
   ```python
   i = 5
   while i > 0:
       print(i)
       i -= 1
   ```
   a) 4  
   b) 5  
   c) 6  
   d) Infinite  

5. **What is the output of the following code?**
   ```python
   for i in range(1, 5):
       if i % 2 == 0:
           print(i, end=" ")
   ```
   a) 1 3  
   b) 2 4  
   c) 1 2 3 4  
   d) None of the above  

---

#### **Program Enhancement and Debugging (6-10):**

6. **Debug the following code to print numbers from 1 to 5:**
   ```python
   i = 1
   while i <= 5:
       print(i)
   ```

7. **Enhance the following code to print only even numbers between 1 and 10:**
   ```python
   for i in range(1, 11):
       print(i)
   ```

8. **Fix the following code to print the multiplication table of 3:**
   ```python
   for i in range(1, 11):
       print(i * i)
   ```

9. **Debug the following nested loop to print a 3x3 grid of stars (`*`):**
   ```python
   for i in range(3):
       for j in range(3):
       print("*")
   ```

10. **Enhance the following code to stop printing when `i` equals 5:**
    ```python
    i = 1
    while i <= 10:
        print(i)
        i += 1
    ```

---

#### **Exercise/App or Program Building (11-15):**

11. **Write a program to print the first 10 natural numbers using a `for` loop.**

12. **Write a program to print the sum of all odd numbers between 1 and 20 using a `while` loop.**

13. **Write a program to print the following pattern using nested loops:**
    ```
    *
    **
    ***
    ****
    *****
    ```

14. **Write a program to find and print the factorial of a number using a `for` loop.**

15. **Write a program to print all prime numbers between 1 and 50 using nested loops and conditions.**

---

### **Constraints:**
- Use proper indentation and syntax.
- Ensure the program runs without errors.
- Follow the problem requirements strictly.

---

### **Example Input/Output:**

#### Example 1:
**Input:**  
Program for Question 11: Print first 10 natural numbers.  
**Output:**  
1 2 3 4 5 6 7 8 9 10  

#### Example 2:
**Input:**  
Program for Question 13: Print a pattern.  
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
4. b) 5  
5. b) 2 4  

6. **Debugged Code:**
   ```python
   i = 1
   while i <= 5:
       print(i)
       i += 1
   ```

7. **Enhanced Code:**
   ```python
   for i in range(1, 11):
       if i % 2 == 0:
           print(i)
   ```

8. **Fixed Code:**
   ```python
   for i in range(1, 11):
       print(i * 3)
   ```

9. **Debugged Code:**
   ```python
   for i in range(3):
       for j in range(3):
           print("*", end="")
       print()
   ```

10. **Enhanced Code:**
    ```python
    i = 1
    while i <= 10:
        if i == 5:
            break
        print(i)
        i += 1
    ```

11. **Program:**
    ```python
    for i in range(1, 11):
        print(i, end=" ")
    ```

12. **Program:**
    ```python
    sum = 0
    i = 1
    while i <= 20:
        if i % 2 != 0:
            sum += i
        i += 1
    print(sum)
    ```

13. **Program:**
    ```python
    for i in range(1, 6):
        for j in range(i):
            print("*", end="")
        print()
    ```

14. **Program:**
    ```python
    num = 5  # Example input
    factorial = 1
    for i in range(1, num + 1):
        factorial *= i
    print(factorial)
    ```

15. **Program:**
    ```python
    for num in range(1, 51):
        if num > 1:
            for i in range(2, num):
                if num % i == 0:
                    break
            else:
                print(num)
    ```

---

Let me know if you’d like me to continue or expand on any part!