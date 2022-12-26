package lab2;

public class Task1AuthorTester {
    public static void main(String[] args) {
        Task1Author Ivanov = new Task1Author("Ivan Ivanov", "1234@mail.ru", 'M');
        System.out.println(Ivanov.toString());
        System.out.println(Ivanov.getEmail());
        Ivanov.setEmail("aboba@");
        System.out.println(Ivanov.getEmail());
    }
}
