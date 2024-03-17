package CO5.worksheet_exceptions_1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        try {
            checkEven(num);
            System.out.println("The number is even.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEven(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Error: Number is odd.");
        }
    }
}
