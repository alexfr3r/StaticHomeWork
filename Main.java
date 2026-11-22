package StaticHomeWork;

public class Main {
    public static void main(String[] args) {

        Company employee1 = new Company(101, "Petya");
        Company employee2 = new Company(102, "Kolya");
        Company.printCompanyName();
        Company.companyName = "Coca Cola";
        Company.printCompanyName();
        System.out.println(employee1.companyName);
        Company.companyName = "ASUS";
        System.out.println(employee2.companyName);
        System.out.println(Company.companyName);
        // employee1.employeeID = 103;

        System.out.println(MathConstants.calculateCircleArea(5));
        System.out.println(MathConstants.calculateCircleArea(7));
        System.out.println(MathConstants.calculateCircleArea(10));
        System.out.println(MathConstants.calculateCircumference(8));
        System.out.println(MathConstants.calculateCircumference(9));
        System.out.println(MathConstants.calculateCircumference(3));
        System.out.println(MathConstants.calculateExponentialGrowth(100, 0.5, 10));

        University studentOne = new University(101, "Petya");
        University studentTwo = new University(102, "Kolya");
        University studentThree = new University(103, "Vasya");

        University.changeUniversityName("SPBGU");
        studentOne.printStudentInfo();
        studentTwo.printStudentInfo();
        studentThree.printStudentInfo();

        GameSettings gameOne = new GameSettings("Angry Birds", 10);
        GameSettings gameTwo = new GameSettings("Spider-Man", 20);
        GameSettings.setMaxPlayers(50);
        gameOne.printGameStatus();
        gameTwo.printGameStatus();
        gameOne.addPlayer();
        gameOne.addPlayer();
        gameOne.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameTwo.addPlayer();
        gameOne.printGameStatus();
        gameTwo.printGameStatus();

        Person personOne = new Person("Vasya", "Ivanov", "123-123");
        Person personTwo = new Person("Kolya", "Petrov", "322-322");
        personOne.setFirstName("Petya");
        personOne.printPersonInfo();
        personTwo.printPersonInfo();


    }
}
