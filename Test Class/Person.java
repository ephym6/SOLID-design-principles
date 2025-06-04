// Constructor
public class Person(String name, int age) {
    this.name = name;
    this.age = age;
}

// Getter methods
public String getName() {
    return name;
}

public int getAge() {
    return age;
}

// Setter methods
public void setName(String name) {
    this.name = name;
}

public void setAge(int age) {
    this.age = age;
}

// Method to display person information
public void introduce() {
    System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
}

// Main method (now empty, just for potential testing)
public static void main(String[] args) {
    // Can add test code here later if needed
}
