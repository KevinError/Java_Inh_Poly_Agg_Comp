package inheritance;

public class BaseEmployee extends Employee{
    private int baseSalary;
    public BaseEmployee (String _firstName, String _lastName, String _ssn, int _baseSalary) {
        super(_firstName, _lastName, _ssn);
        this.baseSalary = _baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
