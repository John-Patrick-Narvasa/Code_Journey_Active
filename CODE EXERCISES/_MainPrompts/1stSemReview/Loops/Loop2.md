Here’s another set of **15 coding exercises** based on the topic of **Loops** (while, for, do-while, nested loops, and loops with conditions). This set includes **Multiple Choice**, **Program Enhancement and Debugging**, and **Exercise/App or Program Building** questions.

---

### **Problem Title/Task Title: Advanced Loop Challenges**

---

### **Problem/Task Summary:**
This set will test your ability to work with loops in various scenarios, including nested loops, conditional loops, and loop control statements. You will solve multiple-choice questions, debug code, and write programs to demonstrate your skills.

---

### **Quiz Items:**

#### **Multiple Choice Questions (1-5):**

1. **What is the output of the following code?**
   ```python
   i = 0
   while i < 3:
       print(i, end=" ")
       i += 1
   ```
   a) 0 1 2  
   b) 1 2 3  
   c) 0 1 2 3  
   d) 1 2  

2. **Which loop is best suited when the number of iterations is unknown?**  
   a) `for` loop  
   b) `while` loop  
   c) `do-while` loop  
   d) None of the above  

3. **What is the purpose of the `continue` statement in a loop?**  
   a) Skip the current iteration  
   b) Exit the loop entirely  
   c) Restart the loop  
   d) None of the above  

4. **How many times will the following loop run?**
   ```python
   for i in range(10, 15):
       print(i)
   ```
   a) 4  
   b) 5  
   c) 6  
   d) Infinite  

5. **What is the output of the following code?**
   ```python
   for i in range(5):
       if i == 3:
           break
       print(i, end=" ")
   ```
   a) 0 1 2  
   b) 0 1 2 3  
   c) 0 1 2 3 4  
   d) None of the above  

---

#### **Program Enhancement and Debugging (6-10):**

6. **Debug the following code to print numbers from 10 to 1 in reverse order:**
   ```python
   i = 10
   while i > 0:
       print(i)
   ```

7. **Enhance the following code to print the sum of numbers from 1 to 10:**
   ```python
   sum = 0
   for i in range(1, 11):
       print(i)
   ```

8. **Fix the following code to print the squares of numbers from 1 to 5:**
   ```python
   for i in range(1, 6):
       print(i * 2)
   ```

9. **Debug the following nested loop to print a 2x2 grid of numbers (1 to 4):**
   ```python
   for i in range(2):
       for j in range(2):
       print(j)
   ```

10. **Enhance the following code to print only multiples of 3 between 1 and 20:**
    ```python
    for i in range(1, 21):
        print(i)
    ```

---

#### **Exercise/App or Program Building (11-15):**

11. **Write a program to print the first 10 even numbers using a `for` loop.**

12. **Write a program to print the Fibonacci series up to 10 terms using a `while` loop.**

13. **Write a program to print the following pattern using nested loops:**
    ```
    1
    12
    123
    1234
    12345
    ```

14. **Write a program to find and print the sum of digits of a number using a `while` loop.**

15. **Write a program to print all numbers between 1 and 100 that are divisible by both 3 and 5 using nested loops and conditions.**

---

### **Constraints:**
- Use proper indentation and syntax.
- Ensure the program runs without errors.
- Follow the problem requirements strictly.

---

### **Example Input/Output:**

#### Example 1:
**Input:**  
Program for Question 11: Print first 10 even numbers.  
**Output:**  
2 4 6 8 10 12 14 16 18 20  

#### Example 2:
**Input:**  
Program for Question 13: Print a number pattern.  
**Output:**  
```
1
12
123
1234
12345
```

---

### **Answers:**

1. a) 0 1 2  
2. b) `while` loop  
3. a) Skip the current iteration  
4. b) 5  
5. a) 0 1 2  

6. **Debugged Code:**
   ```python
   i = 10
   while i > 0:
       print(i)
       i -= 1
   ```

7. **Enhanced Code:**
   ```python
   sum = 0
   for i in range(1, 11):
       sum += i
   print(sum)
   ```

8. **Fixed Code:**
   ```python
   for i in range(1, 6):
       print(i * i)
   ```

9. **Debugged Code:**
   ```python
   for i in range(2):
       for j in range(2):
           print(i * 2 + j + 1, end=" ")
       print()
   ```

10. **Enhanced Code:**
    ```python
    for i in range(1, 21):
        if i % 3 == 0:
            print(i)
    ```

11. **Program:**
    ```python
    for i in range(2, 21, 2):
        print(i, end=" ")
    ```

12. **Program:**
    ```python
    a, b = 0, 1
    count = 0
    while count < 10:
        print(a, end=" ")
        a, b = b, a + b
        count += 1
    ```

13. **Program:**
    ```python
    for i in range(1, 6):
        for j in range(1, i + 1):
            print(j, end="")
        print()
    ```

14. **Program:**
    ```python
    num = 1234  # Example input
    sum = 0
    while num > 0:
        sum += num % 10
        num = num // 10
    print(sum)
    ```

15. **Program:**
    ```python
    for num in range(1, 101):
        if num % 3 == 0 and num % 5 == 0:
            print(num)
    ```

---

Let me know if you’d like me to create another set or expand on any part!