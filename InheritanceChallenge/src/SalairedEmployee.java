public class SalairedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalairedEmployee(String name, String birthDate,
                             String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalairedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    @Override
    public double collectPay() {
       double paycheck = annualSalary / 26;
       double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
       return (int) adjustedPay;
    }
    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}
