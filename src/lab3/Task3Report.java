package lab3;

public class Task3Report {

    public static void getReport(Task3Employee[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.printf("%15s's salary is %.2f$\n", arr[i].getFullname(), arr[i].getSalary());
            i++;
        }
    }
}
