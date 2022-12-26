package lab1;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }
    public static long factorial(int a) {
        long k = 1;
        for (int i = 2; i <= a; i++) {
            k *= i;
        }
        return k;
     }
}
