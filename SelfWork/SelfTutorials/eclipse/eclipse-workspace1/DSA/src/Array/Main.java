package Array;
import ArrayOperations.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        
        // Traverse − print all the array elements one by one.
        arrayOps.traverse(nums);
        
        // Insertion − Adds an element at the given index.

        nums = arrayOps.insert(nums, 2, 25);
        arrayOps.display(nums);
        
        // Deletion − Deletes an element at the given index.
        nums = arrayOps.delete(nums, 3);
        arrayOps.display(nums);
        
        // Search − Searches an element using the given index or by the value.
        int index = arrayOps.search(nums, 50);
        System.out.println("Element 50 found at index: " + index);
        
        // Update − Updates an element at the given index.
        arrayOps.update(nums, 1, 99);
        
        // Display − Displays the contents of the array.
        arrayOps.display(nums);
    }
}
