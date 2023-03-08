package inheritance;

public class SalariedEmployee extends Employee{
    private int weeklySalary;

    public SalariedEmployee (String _firstName, String _lastName, String _ssn,
                             int _weeklySalary)
    {
        super(_firstName, _lastName, _ssn);
        this.weeklySalary = _weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
