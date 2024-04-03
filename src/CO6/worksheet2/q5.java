package CO6.worksheet2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Scanner;


public class q5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("Linked List: " + linkedList);

        System.out.println("Enter element to insert at the first position: ");
        int firstElement = scanner.nextInt();
        linkedList.addFirst(firstElement);

        System.out.println("Linked List after inserting element: " + linkedList);

        System.out.print("Enter element to insert at the last position: ");
        int lastElement = scanner.nextInt();
        linkedList.addLast(lastElement);

        System.out.println("Linked List after inserting element: " + linkedList);

        System.out.print("Enter position to insert element: ");
        int position = scanner.nextInt();
        System.out.print("Enter element to insert: ");
        int element = scanner.nextInt();
        linkedList.add(position, element);

        System.out.println("Linked List after inserting element at specified position:\n" + linkedList);
    }
}
