package inheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    public Employee(String _firstName, String _lastName, String _ssn){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.ssn = _ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
