package CO4.worksheet2.shape;

import java.util.Scanner;

public class Square extends Shape {
    private double side;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        side = scanner.nextDouble();
//        scanner.close();
    }

    public void area() {
        double area = side * side;
        System.out.println("Area of square: " + area);
    }
}
