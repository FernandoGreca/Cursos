package exercicios;

import java.util.*;

public class soma_vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0, cont = 0, media = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        double vet[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();

            soma = soma + vet[i]; 
            cont = cont + 1;
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        System.out.println("SOMA = " + soma);

        media = soma / cont;
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
