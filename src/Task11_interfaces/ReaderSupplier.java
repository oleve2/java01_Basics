package Task11_interfaces;

import Task11_interfaces.Interf.IReader;
import Task11_interfaces.Interf.ISupplier;

public class ReaderSupplier extends User implements IReader, ISupplier {
    public ReaderSupplier(String role, String name) {
        super(role, name);
    }

    @Override
    public void takeBook(Book book) {
        System.out.println("Book " + book.name + " was taken to read");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println("Book " + book.name + " was returned");
    }

    @Override
    public void supplyBook(Book book) {
        System.out.println("Book " + book.name + " was supplied");
    }
}
