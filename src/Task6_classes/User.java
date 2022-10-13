package Task6_classes;

public class User {
    public String name;
    public String surname;
    public String email;

    static int totalOnline = 0;

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String toString() {
        return this.name + " " + this.surname + " " + this.email;
    }
}
