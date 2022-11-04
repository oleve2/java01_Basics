package Task16_hashset_hashmap;

public class Contact {
    private String surname;
    private String name;
    private int age;
    private String phone;

    public Contact(String surname, String name, int age, String phone) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getSurname() { return this.surname; }
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public String getPhone() { return this.phone; }


    public String toString() {
        return this.surname + " " + this.name + " " + this.age + " " + this.phone;
    }
}
