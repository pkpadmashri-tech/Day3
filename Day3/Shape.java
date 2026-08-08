abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculateArea() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double calculateArea() {
        return l * b;
    }
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double calculateArea() {
        return 0.5 * b * h;
    }
}