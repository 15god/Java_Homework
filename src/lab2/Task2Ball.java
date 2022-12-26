package lab2;

public class Task2Ball {
    private double x;
    private double y;
    public Task2Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY( double x, double y) { this.x = x; this.y = y;}
    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }
    @Override
    public String toString() {
        return "Ball current position:" + "(" + x +" , " + y + ")";
    }
}
