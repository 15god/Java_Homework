package lab1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int SumOfArray = 0;
        int ArraySize = sc.nextInt();
        int [] array = new int [ArraySize];
        System.out.println("Enter each element");
        for (int i = 0; i < ArraySize; i++) {
            array[i] = sc.nextInt();
            SumOfArray += array[i];
        }
        System.out.println("Sum = " +SumOfArray);
        System.out.println("Avg = " +SumOfArray/ArraySize);
    }
}
