import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        // C:\Users\Usuario\Desktop\teste\in.txt

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            Map<String, Integer> candidatos = new LinkedHashMap<>();

            while (line != null) {
                String[] informacao = line.split(",");
                String candidato = informacao[0];
                Integer nVoto = Integer.parseInt(informacao[1]);
            
                if (candidatos.containsKey(candidato)) {
                    Integer aVoto = candidatos.get(candidato);

                    candidatos.put(candidato, (nVoto + aVoto));
                } else {
                    candidatos.put(candidato, nVoto);
                }

                line = br.readLine();
            }


            for (String key : candidatos.keySet()) {
                System.out.println(key + ": " + candidatos.get(key));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
