package Task11_interfaces;

public class Main {
    public static void main(String[] args) {
        // book store
        Book[] bookStore = new Book[] {
                new Book("Игра Престолов"),
                new Book("Незнайка на луне"),
                new Book("Букварь"),
                new Book("Война и мир"),
                new Book("Над пропастью во ржи"),
        };

        // actors
        Reader PetyaReader = new Reader("reader", "Petya");
        LibrarianAdmin VasyaLibAdm = new LibrarianAdmin("libr_admin", "Vasya");
        ReaderSupplier MishaReadSupp = new ReaderSupplier("reader_supplier", "Misha");

        // interactions
        VasyaLibAdm.findBookByName("Букварь", bookStore);
        VasyaLibAdm.giveBook(bookStore[4], PetyaReader);

        Book bookToOrder = new Book("Дон Кихот");
        VasyaLibAdm.orderBook(bookToOrder, MishaReadSupp);

        PetyaReader.takeBook(bookStore[3]);
        PetyaReader.returnBook(bookStore[3]);
    }
}
