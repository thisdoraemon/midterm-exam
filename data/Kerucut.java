package data;

public class Kerucut implements GeometricObject {

    private double radius;
    private double height;

    public Kerucut(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cone[radius=" + radius + ", height=" + height + "]";
    }

    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        double baseArea = Math.PI * radius * radius;
        double lateralArea = Math.PI * radius * slantHeight;
        return baseArea + lateralArea;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
