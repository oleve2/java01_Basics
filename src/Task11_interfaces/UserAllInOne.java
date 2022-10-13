package Task11_interfaces;

public class UserAllInOne {}
/*
public class UserAllInOne {
    public String role;
    public String name;

    public User(String role, String name) {
        this.role = role;
        this.name = name;
    }

    // Administrator (4 метода)
    @Override
    public boolean findBookByName(String name, Book[] bookList) {
        for (Book b : bookList) {
            if (b.name.equals(name)) {
                System.out.println("Book " + name + " found!");
                return true;
            }
        }
        return false;
    }

    @Override
    public void giveBook(Book book, User user) {
        System.out.println("Book " + book.name + " given to user " + user.name);
    }

    @Override
    public void notificationOverdue(User user) {
        System.out.println("User " + user.name + " notified for overdue");
    }

    @Override
    public void notificatioReturnDate(User user) {
        System.out.println("User " + user.name + " was informed about return date");
    }

    // Librarian (1 метода)
    @Override
    public void orderBook(Book book, User user) {
        System.out.println("Book " + book.name + " was ordered from user " + user.name);
    }

    // Reader (2 метода)
    @Override
    public void takeBook(Book book) {
        System.out.println("Book " + book.name + " was taken to read");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book " + book.name + " was returned");
    }

    // Supplier (1 метод)
    @Override
    public void supplyBook(Book book) {
        System.out.println("Book " + book.name + " was supplied");
    }
}
*/