package CO6.worksheet2;

import java.util.LinkedList;
import java.util.Scanner;


public class q4 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            linkedList.add(element);
        }

        int firstElement = linkedList.pop();
        System.out.println("First element removed: " + firstElement);
        System.out.println("Linked List after removing the first element: " + linkedList);
    }
}
