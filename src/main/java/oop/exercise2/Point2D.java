package oop.exercise2;

public class Point2D {
    // Private instance variables
    private int x, y;

    // Constructors
    public Point2D() { // default contructor
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Return "(x,y)"
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
