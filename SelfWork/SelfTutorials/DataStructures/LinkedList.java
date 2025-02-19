import java.util.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Complete DSA assignment");
        tasks.add("Eat Lunch");
        tasks.add("Study for IP");

        for (String task : tasks) {
                System.out.println(task);
            }
        }
}
