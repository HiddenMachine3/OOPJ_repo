package CO6.worksheet1;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S1 = scanner.nextLine();

        int length = S1.length();
        System.out.println("Length of this string: " + length);

        char charAt6 = S1.charAt(6);
        System.out.println("The character at position 6: " + charAt6);

        String substring = S1.substring(26, 32);
        System.out.println("The substring from 26 to 32: " + substring);

        int indexOfA = S1.indexOf('a');
        System.out.println("The index position of first 'a': " + indexOfA);

        int indexOfIBM = S1.indexOf("IBM");
        System.out.println("The index of the beginning of the substring 'IBM': " + indexOfIBM);
    }
}