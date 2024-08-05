import java.util.*;
import entitites.Employe;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employe> funcionario = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        // REGISTRA TODOS OS FUNCIONÁRIOS
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (verf(funcionario, id)) {
                System.out.print("This id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            funcionario.add(new Employe(id, name, salary));
        }

        // AUMENTA O SALÁRIO DO FUNCIONÁRIO DESEJADO
        System.out.println();
        System.out.print("Enter the employee id that will hae salary increase : ");
        int idIncrease = sc.nextInt();
        Employe idExist = funcionario.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

        if (idExist == null) {
            System.out.println("This id does not exist!!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            idExist.increaseSalary(percentage);
        }

        // MOSTRA A LISTA DE TODOS OS FUNCIONÁRIOS 
        System.out.println();
        System.out.println("List of employees");
        for (Employe fun : funcionario) {
            System.out.println(fun);
        }
        
        sc.close();
    }

    public static boolean verf(List<Employe> funcionario, int id) {
        Employe idExist = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return idExist != null;
    }
}
