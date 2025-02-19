/* 
Initialization

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
public class Trees {
    static class Person {
        String name;
        Person leftChild, rightChild;
        public Person(String name) {
            this.name = name;
            leftChild = rightChild = null;
        }
    }
    public static void printFamilyTree(Person person, int level) {
        if (person == null) {
            return;
        }
        printFamilyTree(person.rightChild, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("\t\t");
            }
            System.out.println(person.name);
            printFamilyTree(person.leftChild, level + 1);
        }

        public static void main(String[] args) {
            Person grandparent = new Person("Grandparent");
            grandparent.leftChild = new Person("Parent A");
            grandparent.rightChild = new Person("Parent B");
            
            grandparent.leftChild.leftChild = new Person("Child 1");
            grandparent.leftChild.rightChild = new Person("Child 2");
            grandparent.rightChild.leftChild = new Person("Child 3");
            grandparent.rightChild.rightChild = new Person("Child 4");

            System.out.println("Family Tree:");
            printFamilyTree(grandparent, 0);
    }
}
