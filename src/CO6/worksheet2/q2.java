package CO6.worksheet2;

import java.util.LinkedList;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display elements and their positions");
            System.out.println("4. Exit");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.next();
                    linkedList.add(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter the index of the element to remove: ");
                    int indexToRemove = scanner.nextInt();
                    linkedList.remove(indexToRemove);
                    break;
                case 3:
                    for (int i = 0; i < linkedList.size(); i++) {
                        System.out.println("Element at position " + i + ": " + linkedList.get(i));
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
       
    }
}
