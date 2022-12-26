package lab1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] b = new int[size];
        int i = 0;
        int SumOfArray = i;
        while (i != size) {
            b[i] = sc.nextInt();
            SumOfArray += b[i];
            i += 1;
        }
        int max = 0;
        int min = b[0];
        i = 0;
        while (i != size) {
            if (b[i] > max) {
                max = b[i];
            }
            if (b[i] < min) {
                min = b[i];
            }
            i += 1;
        }
        System.out.println("Sum = "+ SumOfArray);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}