/**
 * Created by LAUW on 2/14/17.
 */
public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Employee:");
        Employee employee1 = new Employee();
        employee1.applyForVacation();
        employee1.showHours();
        employee1.showSalary();
        employee1.showVacation();
        System.out.println();

        System.out.println("Secretary:");
        Secretary secretary = new Secretary();
        secretary.applyForVacation();
        secretary.showHours();
        secretary.showSalary();
        secretary.showVacation();
        secretary.takeDictation();
    }
}

