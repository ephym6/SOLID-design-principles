

public class Student extends Person {
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    // Extending functionality without violating LSP
   
    public void introduce() {
        super.introduce();
        System.out.println("I study at " + university + ".");
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        Person student = new Student("Bob", 20, "Tech University");

        person.introduce();
        student.introduce();
    }
}