package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println();
        System.out.println("FINAL GRADE = " + String.format("%.2f", student.soma()));

        if (student.soma() > 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.println(student);
        }

        sc.close();
    }
}