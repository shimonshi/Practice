public class MovableRectangle extends MovablePoint{
    public int x;
    public int y;
    public int speedX;
    public int speedY;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x, int y, int speedY, int speedX){
        x = 1;
        y = 1;
        speedX = 1;
        speedY = 1;
    }
    public String toString() {
        return "x: " + x + ", y: " + y + ", speedX: " + speedY + ", speedY: " + speedY + "\n";
    }
    public void moveUp() {
        y+= 1;
    }
    public void moveDown() {
        y-= 1;
    }
    public void moveLeft() {
        x-= 1;
    }
    public void moveRight() {
        x+= 1;
    }
}
