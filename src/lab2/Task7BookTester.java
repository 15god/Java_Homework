package lab2;
public class Task7BookTester {
    public static void main(String[] args) {
        Task7Book[] arr = new Task7Book[3];
        arr[0] = new Task7Book("Ivanov1", "Skazki1", 2001);
        arr[1] = new Task7Book("Ivanov2", "Skazki2", 2002);
        arr[2] = new Task7Book("Ivanov3", "Skazki3", 2003);
        Task7BookShelf shelf = new Task7BookShelf(arr);
        System.out.println(shelf.book[0].getAuthor());
    }
}