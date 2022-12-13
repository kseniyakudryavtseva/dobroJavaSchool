package shape;

public class Main {
    public static void main (String[] args){
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2,4);
        Square square = new Square(6);
        printArea(circle);
        printArea(rectangle);
        printArea(square);
    }
    public static void printArea(Shape shape){
        System.out.println(shape.area());
    }
}
