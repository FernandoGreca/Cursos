import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

// C:\Users\Usuario\Desktop\repositorio-local-github\Cursos\programacao-java\secao-17\ex\src\File\source.csv


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coloque o caminho do arquivo .csv: ");
        String path = sc.nextLine();

        // Cria uma pasta chamada 'out' no caminho 'C:\\Users\\Usuario\\Desktop\\repositorio-local-github\\Cursos\\programacao-java\\secao-17\\ex\\src\\File'
        new File("C:\\Users\\Usuario\\Desktop\\repositorio-local-github\\Cursos\\programacao-java\\secao-17\\ex\\src\\File" + "\\out").mkdir();
        
        String criarArquivo = "C:\\Users\\Usuario\\Desktop\\repositorio-local-github\\Cursos\\programacao-java\\secao-17\\ex\\src\\File\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(criarArquivo))) {
            List<String> linhas = new ArrayList<>();
            List<Product> products = new ArrayList<>();
            
            // Le todas as linhas do arquivo mencionado acima é armazena cada linha na variável do tipo List 'linhas'
            String linhaCSV = br.readLine();
            while (linhaCSV != null) {
                linhas.add(linhaCSV);
                linhaCSV = br.readLine();
            }
            
            /* Cada linha da lista "linhas" é armazenada em um vetor chamado 'produto'
               nele é armazenado todas as palavras separadas por vírgula(',').

               Em seguida, o item '0' do vetor é um nome salvo na variável 'nome' do tipo String,
               o item '1' é salvo em uma variável 'preco' do tipo double,
               o item '2' é salvo em uma variável 'quantidade' do tipo int.

               Após isso é adiciono a lista products um novo 'Product' recebendo 'nome', 'preco' e 'quantidade' como argumento.

               OBS: é necessário realizar o a conversão usando Tipo.parseTipo(produto[i]) pois o vetor armazena dados do tipo String
            */
            for (String linha : linhas) {
                String[] produto = linha.split(",");

                String nome = produto[0];
                double preco = Double.parseDouble(produto[1]);
                int quantidade = Integer.parseInt(produto[2]);

                products.add(new Product(nome, preco, quantidade));
            }
            

            for (Product product : products) {
                bw.write(product.getName() + ", " + String.format("%.2f", product.totalValueStock()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
