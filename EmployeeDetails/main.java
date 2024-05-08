package EmployeeDetails;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter age: ");
        student.setAge(sc.nextInt());  // Read next integer for age

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter CGPA: ");
        student.setCgpa(sc.nextDouble());

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter branch: ");
        student.setBranch(sc.nextLine());

        // Set address directly
        student.setAddress(new Address("2", "sada", "addsa", 12233));

        System.out.println(student.toString());

        sc.close();
    }
}



