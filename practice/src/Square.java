public class Square extends Rectangle{
    protected  double side;
    public Square(){
        this.side = side;
    }

    Square(double side){
        this.side = side;
    }

    Square(double side, String color, boolean filled){
        this.side = 10;
        this.color = "black";
        this.filled = true;
    }

    public double getSide(){
        this.side = side;
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double side){
        this.width = side;
    }

    public void setLenght(double side){
        this.lenght = side;
    }

    public String toString(){
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}
