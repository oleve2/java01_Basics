package Task6_classes;

public class Main {
    public static void main(String[] args) {
        // задание 1 + 2
        Author auth1 = new Author("John", "Ronald Ruel", "Tolkien", 10);
        Book book1 = new Book("Hobbit", auth1, "adventure", 300);

        System.out.println(auth1.toString());
        System.out.println(book1.toString());
        System.out.println(book1.getInformation());

        System.out.println("=====================================");

        // задание 3
        User u1 = new User("Иван", "Иванов", "ivanov@mail.ru");
        System.out.println(u1.toString());
        User.totalOnline += 1;

        User u2 = new User("Петя", "Петров", "petrov@mail.ru");
        System.out.println(u2.toString());
        User.totalOnline += 1;

        User u3 = new User("Сидор", "Сидоров", "sidorov@mail.ru");
        System.out.println(u3.toString());
        User.totalOnline += 1;

        System.out.println("totalOnline=" + User.totalOnline);
    }
}
