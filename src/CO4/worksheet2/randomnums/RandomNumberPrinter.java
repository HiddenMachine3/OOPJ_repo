package CO4.worksheet2.randomnums;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberPrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int min = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Random number: " + randomNumber);
    }
}