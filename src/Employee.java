public class Employee {

    private String name;
    private String surname;
    private int salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary for " + this.name + " " + this.surname + " is " + this.salary;
    }
}
