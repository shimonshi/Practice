public class Rectangle extends Shape{
    protected double width;
    protected  double lenght;

    public Rectangle(){}

    Rectangle(double width, double lenght) {
        this.width = 2;
        this. lenght = 4;
    }
    Rectangle(double width, double lenght, String color, boolean filled){
        this.width = 2;
        this.lenght = 3;
        this.color = "black";
    }

    public double getWidth(){
        this.width = width;
        return width;
    }

    public double getLenght(){
        this.lenght = lenght;
        return lenght;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLenght(double width){
        this.lenght = lenght;
    }

    public double getArea(){
        return width*lenght;
    }

    public double getPerimeter(){
        return (width+lenght)*2;
    }

    public String toString(){
        return "Shape: rectangle, width: " + this.width+", lenght: "+this.lenght;
    }
}