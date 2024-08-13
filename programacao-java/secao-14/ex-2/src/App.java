import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> produtos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (resp == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.nextLine());    
                
                produtos.add(new UsedProduct(name, price, manufactureDate));
            }
            else if (resp == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                
                produtos.add(new ImportedProduct(name, price, customsFee));
            }
            else if (resp == 'c') {
                produtos.add(new Product(name, price));
            }
        }
        
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : produtos) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
