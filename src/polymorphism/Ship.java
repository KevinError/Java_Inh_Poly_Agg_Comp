package polymorphism;

public class Ship {
    private String nameOfShip;
    private String yearOfShip;

    public Ship(String _nameOfShip, String _yearOfShip){
        this.nameOfShip = _nameOfShip;
        this.yearOfShip = _yearOfShip;
    }

    public String getYearOfShip() {
        return yearOfShip;
    }

    public void setYearOfShip(String yearOfShip) {
        this.yearOfShip = yearOfShip;
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    @Override
    public String toString(){
        return "Name of the ship: " + this.nameOfShip + ", Year of the ship created: " + this.yearOfShip;
    }
}
