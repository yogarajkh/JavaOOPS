//Internals.java
package cie;
public class Internals {
    public int[] internalMarks = new int[5];
    public Internals(int[] marks) {
    for (int i = 0; i < 5; i++) {
        internalMarks[i] = marks[i];
    }
    }
}
//Student.java
package cie;
public class Student {
    public String usn;
    public String name;
    public int sem;
    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }
}
//Externals.java
package see;
import cie.Student;
public class External extends Student 
{
    public int[] seeMarks = new int[5];
    public External(String usn, String name, int sem, int seeMarks[]) 
    {
        super(usn, name, sem);
    for (int i = 0; i < 5; i++) 
    {
        this.seeMarks[i] = seeMarks[i];
    }
    }
}
//Main.java
import cie.Internals;
import see.External;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        for (int i=0;i<n;i++) 
        {
            System.out.println("\nEnter details for the "+(i + 1)+" Student " + ":");
            
            sc.nextLine();
            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();
            
            System.out.println("Enter internal marks for 5 courses (out of 50): ");
            int internalMarks[] = new int[5];
            for (int j=0;j<5;j++) 
            {
                System.out.print("Course " + (j + 1) + " internal marks: ");
                internalMarks[j] = sc.nextInt();
            }
            Internals internal = new Internals(internalMarks);
            
            System.out.println("Enter SEE marks for 5 courses (out of 100): ");
            int seeMarks[] = new int[5];
            for (int j=0;j<5;j++) 
            {
                System.out.print("Course "+(j + 1)+" SEE marks: ");
                seeMarks[j] = sc.nextInt();
            }
            External external = new External(usn, name, sem, seeMarks);
            
            System.out.println("\nFinal Marks for " + external.name + " :" + external.usn + ":for:");
            System.out.println("Semester: " + external.sem);
            System.out.println("Total Marks:");
            for (int j=0;j<5;j++) 
            {
                System.out.println("Course " + (j + 1) + ": " + (double)(internal.internalMarks[j] + (external.seeMarks[j]/2)));
            }
        }
    }
}
