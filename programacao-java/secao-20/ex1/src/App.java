import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Desktop\\teste\\in.txt"))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] sep = line.split(",");
                list.add(new Product(sep[0], Double.parseDouble(sep[1])));
                line = br.readLine();
            }

            double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y / list.size());

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> name = list.stream()
                .filter(p -> p.getPrice() < avg)
                .map(p -> p.getName())
                .sorted(comp.reversed())
                .collect(Collectors.toList());

            name.forEach(System.out::println);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
