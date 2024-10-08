import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println();
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        double soma = 0.0;      
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }

        double avg = soma / n;
        System.out.println();
        System.out.println("Average price = " + String.format("%.2f", avg));

        sc.close();
    }
}
