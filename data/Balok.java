package data;

public class Balok implements GeometricObject {

    private double length;
    private double width;
    private double height;

    public Balok(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Balok[length=" + length + ", width=" + width + ", height=" + height + "]";
    }

    @Override
    public double getPerimeter() {
        return length * width * height;
    }

    @Override
    public double getArea() {
        return 2 * (length * width + width * height + height * length);
    }
}
