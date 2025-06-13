abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    private double b, h;

    public Rectangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    @Override
    public double area() {
        return b * h;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}