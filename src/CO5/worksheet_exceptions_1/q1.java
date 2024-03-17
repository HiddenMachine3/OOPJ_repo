package CO5.worksheet_exceptions_1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        scanner.close();
        
        try {
            DisplayColor(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void DisplayColor(char c) throws Exception {
        if (!Character.isLetter(c)) {
            throw new Exception("Error: Input is not an alphabet.");
        }

        switch (Character.toUpperCase(c)) {
            case 'R':
                System.out.println("Red");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'I':
                System.out.println("Indigo");
                break;
            case 'V':
                System.out.println("Violet");
                break;
            default:
                throw new Exception("Error: Alphabet is not a color of the rainbow.");
        }
    }
}
