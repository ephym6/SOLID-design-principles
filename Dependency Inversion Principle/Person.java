//Dependency Inversion Principle
public interface Introducible {
    // This interface defines a contract for introducing oneself
    void introduce();
}

public class Person implements Introducible {
    //The Person class define how a person introduces themselves since it implements interface
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    @Override
    public void introduce() {
        // Implementing the introduce method from Introducible
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class PersonLogger {
    /*
    This class is responsible for logging introductions
    It depends on the Introducible interface, not on any specific class like Person
    This makes it flexible and follow the Dependency Inversion Principle
    */
    public void logIntroduction(Introducible introducible) {
        introducible.introduce();
    }
}

public class Main {
    //Main class
    public static void main(String[] args) {
        Introducible person = new Person("Alice", 30);
        PersonLogger logger = new PersonLogger();

        // Log the introduction using the interface reference
        logger.logIntroduction(person);
    }
}

