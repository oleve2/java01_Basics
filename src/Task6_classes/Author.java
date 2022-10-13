package Task6_classes;

public class Author {
    public String firstName;
    public String secondName;
    public String thirdName;
    public int reputation;

    // constructor
    public Author(String firstName, String secondName, String thirdName, int reputation) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.reputation = reputation;
    }

    public String toString() {
        return "firstName=" + firstName + " secondName=" + secondName + " thirdName=" + thirdName + " reputation=" + reputation;
    }
}
