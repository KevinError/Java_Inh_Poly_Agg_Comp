package inheritance;

public class HourlyEmployee extends Employee{
    private int wage;
    private int numHour;

    public HourlyEmployee (String _firstName, String _lastName, String _ssn,
                           int _wage, int _numHour)
    {
        super(_firstName, _lastName, _ssn);
        this.wage = _wage;
        this.numHour = _numHour;
    }

    public int getNumHour() {
        return numHour;
    }

    public void setNumHour(int numHour) {
        this.numHour = numHour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
