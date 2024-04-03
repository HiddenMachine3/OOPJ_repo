package CO6.worksheet2;

import java.util.LinkedList;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        LinkedList<Integer> copiedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            originalList.add(element);
        }

        copiedList = (LinkedList<Integer>) originalList.clone();

        System.out.println("Original Linked List: " + originalList);
        System.out.println("Copied Linked List: " + copiedList);
    }
}
