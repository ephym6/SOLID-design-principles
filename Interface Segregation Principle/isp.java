public interface Introducible {
    void introduce();
}

public interface Workable {
    void work();
}

public interface Learnable {
    void study();
}

public class Student extends Person implements Introducible, Learnable {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", and I'm a student.");
    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying.");
    }
}

public class Employee extends Person implements Introducible, Workable {
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + getName() + ", and I work here.");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working.");
    }
}
