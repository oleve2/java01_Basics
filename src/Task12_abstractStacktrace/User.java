package Task12_abstractStacktrace;

public class User {
    public String login;
    public String password;
    public String email;
    public int age;

    public User(String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        return this.login + " " + this.password + " " + this.email + " " + this.age;
    }
}
