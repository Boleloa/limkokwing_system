final class HourlyWorker extends Employee {
    private final double hourlyWage;
    private final int hoursWorked;

    public HourlyWorker(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Implement earnings method for HourlyWorker
    @Override
    public double earnings() {
        if (hoursWorked <= 40) {
            return hourlyWage * hoursWorked;
        } else {
            // Overtime: 1.5 times the hourly rate for hours over 40
            return (hourlyWage * 40) + ((hoursWorked - 40) * hourlyWage * 1.5);
        }
    }
}
