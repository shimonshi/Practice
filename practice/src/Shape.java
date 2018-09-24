public abstract class Shape {
    protected String color;
    protected  boolean filled;

    public String getColor(){
        this.color = color;
        return color;
    }

    public boolean getFilled(){
        this.filled = filled;
        return filled;
    }

    public String setColor(){
        this.color = color;
        return color;
    }

    public boolean isFilled(){
        this.filled = filled;
        return filled;
    }

    public boolean setFilled(){
        this.filled = filled;
        return filled;
    }

    //public double getRadius

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();

}
