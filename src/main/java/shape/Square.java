package shape;

public class Square implements Shape {
    int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public double area() {
        return this.lenght * this.lenght;
    }
}
