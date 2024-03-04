package CO4.worksheet2.numbers;
import CO4.worksheet2.numbers.Pack1.palindrome;
import CO4.worksheet2.numbers.Pack2.oddeven;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        palindrome.checkPalindrome(number);

        oddeven.checkOddEven(number);
    }
}