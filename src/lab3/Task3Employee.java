package lab3;

public class Task3Employee {

    private String fullname;
    private double salary;

    public Task3Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Task3Employee[] arr = new Task3Employee[3];
        arr[0] = new Task3Employee("John Davis", 8000.343242121);
        arr[1] = new Task3Employee("Vasiliy Petrov", 7000.3221);
        arr[2] = new Task3Employee("Judith Moss", 6000.35421);
        Task3Report.getReport(arr);
    }
}
