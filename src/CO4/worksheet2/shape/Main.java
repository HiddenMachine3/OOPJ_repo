package CO4.worksheet2.shape;


public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.input();
        rectangle.area();

        Shape triangle = new Triangle();
        triangle.input();
        triangle.area();

        Shape square = new Square();
        square.input();
        square.area();
    }
}
