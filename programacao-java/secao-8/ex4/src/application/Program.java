
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();

        System.out.print("How many dollar will be bought? ");
        double many = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.calc(dolarPrice, many)));

        sc.close();
    }
}