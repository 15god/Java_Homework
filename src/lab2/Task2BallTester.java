package lab2;

public class Task2BallTester {
    public static void main(String[] args) {
        Task2Ball Ball = new Task2Ball(0,0);
        System.out.println(Ball.toString());
        Ball.setXY( 11 , -5);
        System.out.println(Ball.toString());
        Ball.move(5,8);
        System.out.println(Ball.toString());
        Ball.move(-8,5);
        System.out.println(Ball.toString());
    }
}
