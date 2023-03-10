import polymorphism.*;
public class PolymorphismMain {

    public static void main(String[] args){
        Ship[] shipList = {
                new Ship("Ship", "1996"),
                new CruiseShip("CruiseShip", "1997", 300),
                new CargoShip("CargoShip", "1998", 1000)
        };
        for (Ship ship: shipList){
            System.out.println(ship);
        }
    }
}
