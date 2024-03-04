package CO4.worksheet2.numbers.Pack1;

public class palindrome {
    public static void checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }
    }
}