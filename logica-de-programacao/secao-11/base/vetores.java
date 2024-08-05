package base;

import java.util.*;

public class vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println("\nNUMEROS DIGITADOS:");
        
        for (i = 0; i < N; i++) {
            System.out.println(vet[i]);
        }

        sc.close(); 
    }
}
