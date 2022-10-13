package Task6_classes;

public class Book {
    public String name;
    public Author author;
    public String genre;
    public int cntPages;

    public Book(String name, Author author, String genre, int cntPages) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.cntPages = cntPages;
    }

    public String getInformation() {
        return "Это книга " + this.name + " автора " + this.author
                + " жанра " + this.genre + " (" + this.cntPages + " страниц)";
    }

    public String toString() {
        return "name=" + this.name + " author=" + this.author + " genre="
                + this.genre + " cntPages=" + this.cntPages;
    }
}
