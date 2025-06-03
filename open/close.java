interface IntroductionStrategy {
    void introduce(Person person);
}
class DefaultIntroduction implements IntroductionStrategy {
    public void introduce(Person person) {
        System.out.println("Hello, my name is " + person.getName() + 
                           " and I am " + person.getAge() + " years old.");
    }
}

class YouthIntroduction implements IntroductionStrategy {
    public void introduce(Person person) {
        System.out.println("Hi, I'm " + person.getName() + 
                           ", and I'm a minor.");
    }
}
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { this.name = name; this.age = age; }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // Uses strategy pattern to introduce
    public void introduce(IntroductionStrategy strategy) {
        strategy.introduce(this);
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", 25);
        Person bob = new Person("Bob", 12);

        alice.introduce(new DefaultIntroduction());  // Normal message
        bob.introduce(new YouthIntroduction());      // Minor message
    }
}
