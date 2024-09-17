import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: C:\\Users\\Usuario\\Desktop\\teste\\in.txt");
        String path = "C:\\Users\\Usuario\\Desktop\\teste\\in.txt"; 

        System.out.println("Enter salary: 2000.00");
        double minSalary = 2000.00;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> emp = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] sep = line.split(",");
                emp.add(new Employee(sep[0], sep[1], Double.parseDouble(sep[2])));
                line = br.readLine();
            }


            List<String> email = emp.stream()
                .filter(e -> e.getSalary() > minSalary)
                .map(e -> e.getEmail())
                .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", minSalary) + ":");
            email.forEach(System.out::println);

            
            double sum = emp.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x,y) -> x + y);
            

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
        
    }
}
