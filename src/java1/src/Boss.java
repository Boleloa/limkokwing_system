// Final class Boss (inherits from Employee)
public final class Boss extends Employee {
    private final double weeklySalary;

    // Constructor
    public Boss(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    // Overriding the abstract method to calculate earnings
    @Override
    public double earnings() {
        return weeklySalary;
    }
}
