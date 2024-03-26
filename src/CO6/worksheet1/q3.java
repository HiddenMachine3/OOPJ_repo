package CO6.worksheet1;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birth date (dd/mm/yyyy): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] dateParts = input.split("/");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}
