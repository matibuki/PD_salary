import java.util.ArrayList;

public class Company {
    //    Employee employee;
    private ArrayList<Employee> employeeList;


    public ArrayList<Employee> getEmployees() {
        return employeeList;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employeeList = employees;
    }

    public Company() {
        this.employeeList = new ArrayList<Employee>();
    }


//    public void addNewEmployee(Employee e) {
//        employeeList.add(e);
//    }

    public int employeeNumber() {
        return employeeList.size();
    }


}
