package CO5.worksheet3;
import java.util.Arrays;

public class q4 {
public static void main(String[] args) {
    int[] numbers = {5, 2, 8, 1, 9, 3, 7, 4, 6};
    int searchNumber = 7;

    Thread sortingThread = new Thread(() -> {
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    });

    Thread searchingThread = new Thread(() -> {
        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number " + searchNumber + " found.");
        } else {
            System.out.println("Number " + searchNumber + " not found.");
        }
    });

    sortingThread.start();

    try {
        sortingThread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    searchingThread.start();
    
}
}