package polymorphism;

public class CruiseShip extends Ship{
    private int maxNumPassenger;

    public CruiseShip(String _nameShip, String _yearOfShip, int _maxNumPassenger){
        super(_nameShip, _yearOfShip);
        this.maxNumPassenger = _maxNumPassenger;
    }

    public int getMaxNumPassenger() {
        return maxNumPassenger;
    }

    public void setMaxNumPassenger(int maxNumPassenger) {
        this.maxNumPassenger = maxNumPassenger;
    }

    @Override
    public String toString() {
        return "Name of the ship: " + super.getNameOfShip() +
                ", Maximum number of the passenger: " + this.maxNumPassenger;
    }
}
