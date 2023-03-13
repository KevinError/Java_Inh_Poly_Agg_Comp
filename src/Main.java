import inheritance.*;
import polymorphism.*;
public class Main {

    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee(
                "Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee(
                "Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee(
                "Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee nicole = new CommisionEmployee(
                "Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwa = new SalariedEmployee(
                "Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee(
                "Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee mahnaz = new CommisionEmployee(
                "Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
        System.out.println(joe.getFirstName() + " " + joe.getLastName() + ", " +
                joe.getSsn() + ", Week Salary: " + joe.getWeeklySalary());
        System.out.println(stephanie.getFirstName() + " " + stephanie.getLastName() + ", " + stephanie.getSsn() +
                "Wage: " + stephanie.getWage() + ", Number of Hour: " + stephanie.getNumHour());
        System.out.println(mary.getFirstName() + " " + mary.getLastName() + "," + mary.getSsn() +
                "Wage: " + mary.getWage() + ", Number of Hour: " + mary.getNumHour());
        System.out.println(nicole.getFirstName() + " " + nicole.getLastName() + ", " + nicole.getSsn() +
                "Commission Rate: " + nicole.getCommissionRate() + "GrossSale: " + nicole.getGrossSale());
        System.out.println(renwa.getFirstName() + " " + renwa.getLastName() + ", " + renwa.getSsn() +
                "Week Salary:" + renwa.getWeeklySalary());
        System.out.println(mike.getFirstName() + " " + mike.getLastName() + ", " + mike.getSsn() +
                "Base Salary: " + mike.getBaseSalary());
        System.out.println(mahnaz.getFirstName() + " " + mahnaz.getLastName() + ", " + mahnaz.getSsn() +
                "Commision Rate: " + mahnaz.getCommissionRate() + ", GrossSale: " + mahnaz.getGrossSale());

    }
}