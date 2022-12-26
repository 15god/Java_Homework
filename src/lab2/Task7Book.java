package lab2;

public class Task7Book {
    private String author;
    private String name;
    private int date;
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getDate() {
        return date;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public Task7Book(){
        author = "none";
        name = "none";
        date = 0;
    }
    public Task7Book(String author, String name, int date) {
        this.author = author;
        this.name = name;
        this.date = date;
    }
}
