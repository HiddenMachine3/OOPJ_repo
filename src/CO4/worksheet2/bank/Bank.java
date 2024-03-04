package CO4.worksheet2.bank;

import java.util.Scanner;

public class Bank {
    public final void displayFixedLoanAmount() {
        System.out.println("Fixed loan amount: Rs.1500000");
    }

    public void displayLoanSchemes(int age) {
        if (age <= 25) {
            System.out.println("Education Loan Scheme: Rs.1000000");
        } else if (age <= 45) {
            displayFixedLoanAmount();
        } else if (age <= 60) {
            System.out.println("Home Loan Scheme: Rs.2000000");
        } else {
            System.out.println("No loan schemes available for the given age");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        bank.displayLoanSchemes(age);
    }
}