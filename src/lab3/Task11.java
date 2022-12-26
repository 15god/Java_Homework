package lab3;
import java.util.Random;
public class Task11 {
    public static void main(String[] args) {
        double [] a = new double [10];
        double [] b = new double [10];
        Random1(b);
        Random2(a);
        SortDouble(a);
        SortDouble(b);
        PrintArray(b);
        PrintArray(a);
    }
    public static void Random1(double [] a) {
        for (int i = 0; i <10; i++) {
            a[i] = Math.random();
            System.out.println(a[i]);
        }
    }
    public static void Random2(double [] a) {
        Random rand = new Random();
        for (int i = 0; i <10; i++) {
            a[i] = rand.nextInt(1000);
            System.out.println(a[i]);
        }
    }
    public static void SortDouble(double [] a) {
        boolean sorted = false;
        double temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < 9; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void PrintArray(double[] b) {
        for (int i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }
    }
}
