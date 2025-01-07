import java.util.*;

abstract class Shape {
    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    @Override
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        int len = scanner.nextInt();

        System.out.println("Enter the breadth of the rectangle:");
        int breth = scanner.nextInt();

        System.out.println("Enter the base of the triangle:");
        int b = scanner.nextInt();

        System.out.println("Enter the height of the triangle:");
        int h = scanner.nextInt();

        System.out.println("Enter the radius of the circle:");
        int r = scanner.nextInt();

        Shape rectangle = new Rectangle(len, breth);
        Shape triangle = new Triangle(b, h);
        Shape circle = new Circle(r);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();

        
    }
}
