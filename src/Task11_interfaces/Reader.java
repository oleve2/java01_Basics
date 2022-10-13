package Task11_interfaces;

import Task11_interfaces.Interf.IReader;

public class Reader extends User implements IReader {
    public Reader(String role, String name) {
        super(role, name);
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Book " + book.name + " was taken to read by " + this.name);
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book " + book.name + " was returned by " + this.name);
    }
}
