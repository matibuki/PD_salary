import java.util.Scanner;

public class UserInputHelper {

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
    public Employee getEmployeeFromUser() {
        String name = getStringFromUser("name");
        String surname = getStringFromUser("surname");
        int salary = getIntFromUser("Please enter emplyoee salary: ");

        return new Employee(name, surname, salary);
    }
}
