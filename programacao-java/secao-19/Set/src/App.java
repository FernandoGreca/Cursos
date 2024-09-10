import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = "C:\\Users\\Usuario\\Desktop\\teste\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();

            while (line != null) {
                String[] p = line.split(" ");
                String userName = p[0];
                Date moment = Date.from(Instant.parse(p[1]));
                
                // O proprio método 'set' realiza a verificação de que se existe usuário repetido ele não é inserido
                set.add(new LogEntry(userName, moment));

                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        sc.close();
    }
}
