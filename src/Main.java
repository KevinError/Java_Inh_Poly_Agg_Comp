import inheritance.*;
import polymorphism.*;
public class Main {
    Employee joe = new SalariedEmployee(
            "Joe", "Jones", "111-11-1111", 2500);
    Employee stephanie = new HourlyEmployee(
            "Stephanie", "Smith", "222-22-2222", 25, 32);
    Employee mary = new HourlyEmployee(
            "Mary", "Quinn", "333-33-3333", 19, 47);
    Employee nicole = new CommisionEmployee(
            "Nicole", "Dior", "444-44-4444", 15, 50000);
    Employee renwa = new SalariedEmployee(
            "Renwa", "Chanel", "555-55-5555", 1700);
    Employee mike = new BaseEmployee(
            "Mike", "Davenport", "666-66-6666", 95000);
    Employee mahnaz = new CommisionEmployee(
            "Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

    public static void main(String[] args) {

    }
}