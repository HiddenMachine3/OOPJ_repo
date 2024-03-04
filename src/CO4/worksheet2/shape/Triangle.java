package CO4.worksheet2.shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        height = scanner.nextDouble();
//        scanner.close();
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
}