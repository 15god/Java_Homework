package lab2;
public class Task6CircleTester {
    public static void main(String[] args) {
        double r;
        Task6Circle k1 = new Task6Circle(7);
        Task6Circle k2 = new Task6Circle(8);
        System.out.println("1st circle square = " + k1.getSquare() + "cm");
        System.out.println("1st circle Length = " + k1.getLength() + "cm\n");
        System.out.println("2st circle square = " + k2.getSquare() + "cm ");
        System.out.println("2st circle Length = " + k2.getLength() + "cm\n");
        Task6Circle.equals(k1, k2);
    }
}
