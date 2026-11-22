package StaticHomeWork;

public class University {
    // поля
    static String universityName;
    final int STUDENT_ID;
    String studentName;

    University(int STUDENT_ID, String studentName) {
        this.STUDENT_ID = STUDENT_ID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Name: " + this.studentName + ", ID: " + this.STUDENT_ID + ", University: " + University.universityName);
    }
}
