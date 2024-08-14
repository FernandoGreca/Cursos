import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;



public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if (resp == 'i') {
                System.out.print("Health expendiures: ");
                double gastoSaude = sc.nextDouble();

                list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            }
            else if (resp == 'c') {
                System.out.print("Number of employees: ");
                int numeroFuncionario = sc.nextInt();

                list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionario));
            }

        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Pessoa pessoa : list) {
            System.out.println(pessoa);
        }

        double soma = 0.0;
        for (Pessoa pessoa : list) {
            soma += pessoa.imposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", soma));

        sc.close();
    }
}
