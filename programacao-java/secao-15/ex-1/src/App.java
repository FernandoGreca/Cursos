import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exeption.WithdrawLimitError;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, name, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (WithdrawLimitError e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } 

        sc.close();
    }
}
