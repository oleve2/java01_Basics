package Task11_interfaces;

import Task11_interfaces.Interf.IAdministrator;
import Task11_interfaces.Interf.ILibrarian;

public class LibrarianAdmin extends User implements IAdministrator, ILibrarian {

    public LibrarianAdmin(String role, String name) {
        super(role, name);
    }

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

    @Override
    public void orderBook(Book book, User user) {
        System.out.println("Book " + book.name + " was ordered from user " + this.name + " to supplier " + user.name);
    }
}
