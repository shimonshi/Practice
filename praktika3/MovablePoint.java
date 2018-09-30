public class MovablePoint {
    public int x;
    public int y;
    public int speedX;
    public int speedY;

    MovablePoint(){
        int x = 1;
        int y = 1;
        int speedX = 1;
        int speedY = 1;
    }

    MovablePoint(int x, int y, int speedX, int speedY){
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
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
