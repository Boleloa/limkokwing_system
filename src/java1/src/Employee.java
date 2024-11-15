// Abstract class Employee
public abstract class Employee {
    private final String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract method to calculate earnings (to be implemented by subclasses)
    public abstract double earnings();
}
