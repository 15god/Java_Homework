package lab2;

public class Task6Circle {
    private double r;
    public Task6Circle(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getLength(){
        double c;
        c = 2*Math.PI*r;
        return c;
    }
    public double getSquare() {
        double c;
        c = Math.PI * r*r;
        return c;
    }
    public static void equals( Task6Circle k1, Task6Circle k2) {
        if ( k1.getR() > k2.getR() ) {
            System.out.println(" 1st Circle is bigger"); }
        else if ( k1.getR() == k2.getR() ) {
            System.out.println(" Circles are equal"); }
        else {
            System.out.println(" 2st Circle is bigger");
        }
    }
    @Override
    public String toString() {
        return "Circle r= "+ r;
    }

}
