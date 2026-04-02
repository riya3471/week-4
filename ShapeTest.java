package weekiv;

class Shape {
    double getArea() {
        return 0;
    }

    double getPerimeter() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
    }
}