import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Fernando");
        list.add("Julio");
        list.add("Marta");
        list.add("Felipe");
        list.add(2, "Marco");

        System.out.println(list.size());
        for (String nome : list) {
            System.out.println(nome);
        }
        
        System.out.println("-------------------------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String nome : list) {
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        System.out.println("Index of Fernando: " + list.indexOf("Fernando"));

        System.out.println("-------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());
        for (String nomeFiltrado : result) {
            System.out.println(nomeFiltrado);
        }

        System.out.println("-------------------------");

        String elementIfLetterF = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(elementIfLetterF);

    }
}
