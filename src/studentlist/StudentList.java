package studentlist;

import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
        
        Student[] students = new Student[2];
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < students.length; i++){
            
            System.out.println("Enter the students name: ");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i] = student;
        }
        
        System.out.println("Printing the students: ");
        
        String format = "The students name is %s\n";
        
        for (Student student: students) {
            
            System.out.printf(format, student.getName());
        }
        
    }
    
}
