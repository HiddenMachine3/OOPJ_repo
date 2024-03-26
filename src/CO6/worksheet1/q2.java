package CO6.worksheet1;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = scanner.nextLine();

        System.out.print("Enter string s3: ");
        String s3 = scanner.nextLine();

        String replacedString = s1.replace('l', 'L');
        System.out.println("Replaced string: " + replacedString);

        String uppercaseString = s1.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        String lowercaseString = s2.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        String trimmedString = s3.trim();
        System.out.println("Trimmed string: " + trimmedString);

        System.out.println("First string: " + s1);
    }
}