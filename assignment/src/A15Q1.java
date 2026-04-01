import java.util.*;

// Abstract class
abstract class Shape {
    protected double length, breadth, height;

    // Constructor
    Shape(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Abstract methods
    abstract double volume();
    abstract double surfaceArea();
}

// Cube class
class Cube extends Shape {

    Cube(double side) {
        super(side, side, side);
    }

    double volume() {
        return length * length * length;
    }

    double surfaceArea() {
        return 6 * length * length;
    }
}

// Cuboid class
class Cuboid extends Shape {

    Cuboid(double l, double b, double h) {
        super(l, b, h);
    }

    double volume() {
        return length * breadth * height;
    }

    double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}

// Cylinder class
class Cylinder extends Shape {

    Cylinder(double radius, double height) {
        super(radius, 0, height);
    }

    double volume() {
        return Math.PI * length * length * height;
    }

    double surfaceArea() {
        return 2 * Math.PI * length * (length + height);
    }
}

// Main class
public class A15Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cube
        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);

        // Cuboid
        System.out.print("Enter length, breadth, height of cuboid: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Cuboid cuboid = new Cuboid(l, b, h);

        // Cylinder
        System.out.print("Enter radius and height of cylinder: ");
        double r = sc.nextDouble();
        double ch = sc.nextDouble();
        Cylinder cylinder = new Cylinder(r, ch);

        // Display results
        System.out.println("\n--- Cube ---");
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface Area: " + cube.surfaceArea());

        System.out.println("\n--- Cuboid ---");
        System.out.println("Volume: " + cuboid.volume());
        System.out.println("Surface Area: " + cuboid.surfaceArea());

        System.out.println("\n--- Cylinder ---");
        System.out.println("Volume: " + cylinder.volume());
        System.out.println("Surface Area: " + cylinder.surfaceArea());
    }
}