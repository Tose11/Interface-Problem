
package extrainterface;

public interface Shape {
     double getArea();
}
class Rectangle implements Shape {
    private double length, width;
    public Rectangle(double l, double w) { length = l; width = w; }
    public double getArea() { return length * width; }
}

class Circle implements Shape {
    private double radius;
    public Circle(double r) { radius = r; }
    public double getArea() { return Math.PI * radius * radius; }
}

class Triangle implements Shape {
    private double base, height;
    public Triangle(double b, double h) { base = b; height = h; }
    public double getArea() { return 0.5 * base * height; }
}

class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(10, 12);
        Shape c = new Circle(3);
        Shape t = new Triangle(4, 6);

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Triangle Area: " + t.getArea());
    }
}