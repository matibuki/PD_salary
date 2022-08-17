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


}
