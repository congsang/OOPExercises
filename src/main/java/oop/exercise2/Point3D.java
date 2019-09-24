package oop.exercise2;

public class Point3D extends Point2D {
    // Private instance variables
    private int z;

    // Contructors
    public Point3D() { // default contructors
        super(); // x = y = 0
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // Getter and Setter
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // Return "(x,y,z)"
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
