package data;

public class Bola implements GeometricObject {

    private double radius;

    public Bola(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Sphere[radius=" + radius + "]";
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
