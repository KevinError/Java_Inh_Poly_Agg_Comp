package polymorphism;

public class CargoShip extends Ship{
    private int capacityOfCargo;

    public CargoShip(String _nameOfShip, String _yearOfShip, int _capacityOfCargo) {
        super(_nameOfShip, _yearOfShip);
        this.capacityOfCargo = _capacityOfCargo;
    }

    public int getCapacityOfCargo() {
        return capacityOfCargo;
    }

    public void setCapacityOfCargo(int capacityOfCargo) {
        this.capacityOfCargo = capacityOfCargo;
    }

    @Override
    public String toString() {
        return "Name of the ship: " + super.getNameOfShip() +
                ", Capacity of the Cargo: " + this.capacityOfCargo;
    }
}
