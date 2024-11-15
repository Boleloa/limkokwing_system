// Final class CommissionWorker (inherits from Employee)
public final class CommissionWorker extends Employee {
    private final double baseSalary;
    private final double commissionRate;
    private final double sales;

    // Constructor
    public CommissionWorker(String name, double baseSalary, double commissionRate, double sales) {
        super(name);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.sales = sales;
    }

    // Overriding the abstract method to calculate earnings
    @Override
    public double earnings() {
        return baseSalary + (commissionRate * sales);
    }
}
