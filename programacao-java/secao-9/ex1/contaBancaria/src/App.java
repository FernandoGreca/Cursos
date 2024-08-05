import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        // Dados inicias da conta
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        // Realizar depósito inicial
        System.out.print("Is there an initial deposit (y/n)? ");
        char responta = sc.next().charAt(0);

        // Verifica se vai ser feito o depósito inicial ou não
        if (responta == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            // Cria conta com número, titular e saldo
            account = new Account(number, holder, initialDeposit);
        } 
        else {
            // Cria conta com número e titular, neste caso o soldo seria 0
            account = new Account(number, holder);
        }

        // Informa os dados da conta como número, titular e saldo
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        // Realiza um depósito
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        // Informa os dados da conta como número, titular e saldo
        System.out.println("Updated account data:");
        System.out.println(account);

        // Realiza um saque
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        // Informa os dados da conta como número, titular e saldo
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
