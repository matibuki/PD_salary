import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    private final List<Employee> employeeList;

    public List<Employee> getEmployees() {
        return employeeList;
    }

    public Company() {
        employeeList = new ArrayList<>();
    }

    public Employee getEmployeeFromUser() {
        String name = getStringFromUser("name");
        String surname = getStringFromUser("surname");
        int salary = getIntFromUser("Please enter emplyoee salary: ");

        return new Employee(name, surname, salary);
    }

    public void addEmplyoee(Employee newEmployee) {
        employeeList.add(newEmployee);
    }


    public void getAllData() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    public int getSumOfAllSalaries() {
        int salarySum = 0;
        for (Employee employee : employeeList) {

            salarySum = salarySum + employee.getSalary();
        }
        return salarySum;
    }

    public static String getStringFromUser(String nameOrSurname) {
        System.out.println("Please enter employee " + nameOrSurname + ": ");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            System.out.println("This is not a name! Please try again:");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static int getIntFromUser(String whatToAskUser) {
        System.out.println(whatToAskUser);
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

}
