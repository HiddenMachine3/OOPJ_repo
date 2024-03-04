package CO4.worksheet2.shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        width = scanner.nextDouble();
//        scanner.close();
    }

    public void area() {
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}