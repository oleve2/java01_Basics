package Task16_hashset_hashmap;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() { return this.name; }
    public String getGroup() { return this.group; }
    public String getStudentId() { return this.studentId; }

    @Override
    public int hashCode() {
        return this.studentId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.studentId.equals(other.studentId);
    }

    @Override
    public String toString() {
        return this.studentId + " " + this.name + " " + this.group;
    }
}
