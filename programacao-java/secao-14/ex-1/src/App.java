import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of employees: ");
        int quant = sc.nextInt();

        List<Employee> emp = new ArrayList<>();

        for (int i = 0; i < quant; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per Hours: ");
            Double valuePerHours = sc.nextDouble();

            
            if (resp == 'y') {
                System.out.print("Additional Charge: ");
                Double additionalCharge = sc.nextDouble();

                emp.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
            } else {
                emp.add(new Employee(name, hours, valuePerHours));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : emp) {
            System.out.println(employee);
        }

        sc.close();
    }
}
