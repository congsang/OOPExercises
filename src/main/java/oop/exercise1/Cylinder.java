package oop.exercise1;

public class Cylinder extends Circle {
    // private instance variable
    private double height;

    // Constructors
    public Cylinder() {
        super(); // invoke superclass constructor Circle()
        this.height = height;
    }

    public Cylinder(double height) {
        super(); // invoke superclass constructor Circle()
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius); // invoke superclass constructor Circle()
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color); // invoke superclass constructor Circle()
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Return the volume of this Cylinder
    public double getVolume() {
        return getArea() * height; // Use Circle's getArea()
    }

    @Override
    public String toString() {
        return "This is a Cylinder"; // to be refined later
    }
}
