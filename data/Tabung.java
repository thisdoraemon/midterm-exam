package data;

public class Tabung implements GeometricObject {

    private double radius;
    private double height;

    public Tabung(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + radius + ", height=" + height + "]";
    }

    @Override
    public double getArea() {
        double baseArea = Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralArea;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
