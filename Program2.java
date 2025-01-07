import java.util.*;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;

    Student(int numSubjects) {
        credits = new int[numSubjects];
        marks = new int[numSubjects];
    }

    double calculateSGPA() {
        int totalCredits = 0;
        int weightedGradePoints = 0;
        for (int i = 0; i < credits.length; i++) {
            int gradePoint = getGradePoint(marks[i]);
            weightedGradePoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }
        return (double) weightedGradePoints / totalCredits;
    }

    int getGradePoint(int marks) {
        if (marks >= 90) return 10;
        if (marks >= 80) return 9;
        if (marks >= 70) return 8;
        if (marks >= 60) return 7;
        if (marks >= 50) return 6;
        return 0;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students (minimum 2): ");
        int numStudents = sc.nextInt();
        while (numStudents < 2) {
            System.out.print("Please enter at least 2 students: ");
            numStudents = sc.nextInt();
        }
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new Student(numSubjects);
            System.out.print("Enter USN: ");
            students[i].usn = sc.nextLine();
            System.out.print("Enter Name: ");
            students[i].name = sc.nextLine();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter credits for subject " + (j + 1) + ": ");
                students[i].credits[j] = sc.nextInt();
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }
            sc.nextLine();
        }
        System.out.println("\nStudent Details and SGPA:");
        for (Student student : students) {
            System.out.println("\nUSN: " + student.usn);
            System.out.println("Name: " + student.name);
            System.out.printf("SGPA: %.2f\n", student.calculateSGPA());
        }
        sc.close();
    }
}
