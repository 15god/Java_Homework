package lab2;

public class Task1Author {
    private String name;
    private String email;
    private char gender;
    public Task1Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Author info:\n" + name + "\n" + email + "\n" + gender + "\n";
    }
}
