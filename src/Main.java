import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        int totalEmployeesNumber = 5;

        for (int i = 0; i < totalEmployeesNumber; i++) {
            company.addEmplyoee(company.getEmployeeFromUser());
        }

        String menuList = ("""

                Choose what to do:\s

                1 – Print sum of all employees salary

                2 – Display all employees data

                3 – Add new employee

                4 – End program""");

        while (true) {
            System.out.println(menuList);
            int menuOption = Company.getIntFromUser("Please choose menu option");
            switch (menuOption) {
                default -> System.out.println(menuList);
                case 1 -> System.out.println("The sum of all salaries: " + company.getSumOfAllSalaries());
                case 2 -> company.getAllData();
                case 3 -> company.addEmplyoee(company.getEmployeeFromUser());
                case 4 -> System.exit(0);
            }
        }
    }
}

