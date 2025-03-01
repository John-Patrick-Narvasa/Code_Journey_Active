package ArrayOperations;

public class arrayOps {
    public static void traverse(int[] arr) {
        System.out.print("Array elements: ");
        for (int num = 0; num < arr.length; num++) {
            System.out.print(arr[num] + " ");
        }
        System.out.println();
    }
    
    public static int[] insert(int[] arr, int index, int value) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index!");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
    
    public static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index!");
            return arr;
        }
        
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue;
            newArr[j++] = arr[i];
        }
        return newArr;
    }
    
    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Element not found
    }
    
    public static void update(int[] arr, int index, int newValue) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index!");
            return;
        }
        arr[index] = newValue;
    }
    
    public static void display(int[] arr) {
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}		
