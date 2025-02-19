import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        
        books.push("Java Language");
        books.push("Data Structures");
        books.push("Algorithms");

        System.out.println("Top Book: " + books.peek());
        books.pop();

        System.out.println("After removing top book: " + books.peek());
        books.pop();

        System.out.println("Bottom Book: " + books.peek());
    }
}
