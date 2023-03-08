package inheritance;

public class CommisionEmployee extends Employee{
    private int commissionRate;
    private int grossSale;

    public CommisionEmployee(String _firstName, String _lastName, String _ssn,
                             int _commissionRate, int _grossSale)
    {
        super(_firstName, _lastName, _ssn);
        this.commissionRate = _commissionRate;
        this.grossSale = _grossSale;
    }

    public int getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(int grossSale) {
        this.grossSale = grossSale;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }
}
