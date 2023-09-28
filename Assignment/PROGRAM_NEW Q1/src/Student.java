import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {//method that returns name
        return name; 
    }

    public int getAge() { //method that returns age
        return age;
    }

    public void setName(String name) { //mutator method that sets name
        this.name = name;
    }

    public void setAge(int age) { //mutator method that sets age
        this.age = age;
    }

    public String toString() { //Concatenates name and age
        return "Name: " + name + ", Age: " + age;
    }

    public static void captureStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("Invalid age. Age must be greater than or equal to 16.");
            return;
        }

        students.add(new Student(name, age));
        System.out.println("Student details saved successfully.");
    }

    public static void searchStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        if (studentId >= 0 && studentId < students.size()) {
            System.out.println("Student found: " + students.get(studentId));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void deleteStudent(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        int studentId = scanner.nextInt();

        if (studentId >= 0 && studentId < students.size()) {
            System.out.println("Do you want to delete this student? (yes/no)");
            String confirmation = scanner.next().toLowerCase();

            if (confirmation.equals("yes")) {
                students.remove(studentId);
                System.out.println("Student deleted successfully.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void studentReport(ArrayList<Student> students) {
        System.out.println("Student Report:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student ID: " + i + ", " + students.get(i));
        }
    }

    public static void exitStudentApplication() {
        System.out.println("Exiting the application.");
        System.exit(0);
    }
}

