import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());

        // list.removeIf(p -> p.getPrice() >= 100.00);

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
