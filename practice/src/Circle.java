import java.math.*;
public class Circle extends Shape{
    protected double radius;
    protected String color;
    protected boolean filled;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = 5;
        this.color = "black";
        this.filled = true;
    }

    public boolean isFilled(){
        this.filled = true;
        return filled;
    }

    public double getRadius() {
        this.radius = radius;
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}
