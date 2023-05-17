package entities;

public class Rectangle {
    public double width, height;

    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public double diagonal() {
        return Math.sqrt(height * height + width * width);
    }
}