package lab3;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {
        int[] a = rand4nums();
        System.out.println(isIncreasing(a));
    }

    public static int[] rand4nums() {
        Random rand = new Random();
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = rand.nextInt(10, 100);
            System.out.println(a[i]);
        }
        return a;
    }

    public static boolean isIncreasing(int[] a) {
        int i = 0;
        while (i < 3) {
            if (a[i] < a[i + 1]) {
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
