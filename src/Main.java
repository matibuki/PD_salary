import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Employee employee;
    Company company;

    public static void createNewEmployee() {
        Employee newEmployee = new Employee(getStringFromUser("name"),
                getStringFromUser("surname"),
                getIntFromUser("Please enter employee salary: "));
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


    public static void getAllSalaries(ArrayList<Employee> employeeList) {
        int salarySum = 0;
        for (Employee employee : employeeList) {

            salarySum = salarySum + employee.getSalary();
        }
        System.out.println("Salary total of all employees is: " + salarySum);
    }

    public static void getAllData(ArrayList<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println("Salary for " + employee.getName() + " " + employee.getSurname() +
                    " is " + employee.getSalary());
        }

    }

    public static void addNewEmployee(ArrayList<Employee> employeeList) {
        employeeList.add(new Employee(getStringFromUser("name"),
                getStringFromUser("surname"), getIntFromUser("Please enter employee salary: ")));
    }


    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        int totalEmployeesNumber = 5;
        for (int i = 0; i < totalEmployeesNumber; i++) {
            addNewEmployee(employeeList);
        }

        String menuList = ("\n" + "Choose what to do: " + "\n" + "\n" +
                "1 – Print sum of all employees salary" + "\n" + "\n" +
                "2 – Display all employees data" + "\n" + "\n" +
                "3 – Add new employee" + "\n" + "\n" +
                "4 – End program");

//        int menuOption = getIntFromUser("Please choose menu option");
        while (true) {
            System.out.println(menuList);
            int menuOption = getIntFromUser("Please choose menu option");
            switch (menuOption) {
                default:
                    System.out.println(menuList);
                    break;
                case 1:
                    getAllSalaries(employeeList);
                    break;
                case 2:
                    getAllData(employeeList);
                    break;
                case 3:
                    addNewEmployee(employeeList);
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }


}

