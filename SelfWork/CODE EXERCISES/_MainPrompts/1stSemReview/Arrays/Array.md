## Problem Title/Task Title: Array Manipulation with Loops

### Problem/Task Summary:
You are tasked with writing Java programs that manipulate arrays using various types of loops. The provided code snippets are poorly written and contain edge cases that need to be handled. Your job is to enhance and debug these programs to meet the specified requirements.

### Example Input/Output

1. **Example 1**  
   **Input:**  
   - Array: `[1, 2, 3, 4, 5]`  
   - Condition: Elements must be doubled if they are even.  
   **Output:**  
   - Resulting Array: `[1, 4, 3, 8, 5]`

2. **Example 2**  
   **Input:**  
   - Array: `[10, 15, 20, 25]`  
   - Condition: Replace elements greater than 20 with `-1`.  
   **Output:**  
   - Resulting Array: `[10, 15, -1, -1]`

3. **Example 3**  
   **Input:**  
   - Array: `[5, 3, 8, 1, 6]`  
   - Condition: Sum all elements less than 5.  
   **Output:**  
   - Sum: `4`  

### Constraints:
- The input array can have a length between 1 and 100.
- Values in the array can range from -1000 to 1000.
- Handle edge cases such as empty arrays or all elements being negative.

---

### Answers:

1. **Example 1 Solution:**  
   ```java
   public class ArrayManipulation {
       public static void main(String[] args) {
           int[] arr = {1, 2, 3, 4, 5};
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] % 2 == 0) {
                   arr[i] *= 2;
               }
           }
           System.out.println(Arrays.toString(arr));
       }
   }
   ```

2. **Example 2 Solution:**  
   ```java
   public class ArrayManipulation {
       public static void main(String[] args) {
           int[] arr = {10, 15, 20, 25};
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] > 20) {
                   arr[i] = -1;
               }
           }
           System.out.println(Arrays.toString(arr));
       }
   }
   ```

3. **Example 3 Solution:**  
   ```java
   public class ArrayManipulation {
       public static void main(String[] args) {
           int[] arr = {5, 3, 8, 1, 6};
           int sum = 0;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] < 5) {
                   sum += arr[i];
               }
           }
           System.out.println(sum);
       }
   }
   ```