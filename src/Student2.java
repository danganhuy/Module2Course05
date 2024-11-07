public class Student2 {
    private String name;
    private String classes;

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student2() {
        name = "John Doe";
        classes = "IT";
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
