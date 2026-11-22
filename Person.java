package StaticHomeWork;

public class Person {
    // поля
    private String firstName;
    private String lastName;
    private final String SSN;

    Person(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    // getters
    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSSN() {
        return this.SSN;
    }

    // setters for first and last name;
    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + this.firstName + ", Last name: " + this.lastName + ", SSN: " + this.SSN);
    }
}
