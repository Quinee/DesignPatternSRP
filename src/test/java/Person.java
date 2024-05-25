class abc{}
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display the state of the person
    public void displayState() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }

    public static void main(String[] args) {
        // Creating a new Person object
        Person person = new Person("Alice", 30);

        // Displaying the initial state
        person.displayState(); // Output: Name: Alice, Age: 30

        // Changing the state
        person.setName("Bob");
        person.setAge(25);

        // Displaying the updated state
        person.displayState(); // Output: Name: Bob, Age: 25
    }
}
