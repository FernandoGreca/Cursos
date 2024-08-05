package exercicios;

import java.util.*;

public class soma_impares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int maior, menor, soma;

        soma = 0;
        maior = 0;
        menor = 0;

        if (n1 < n2) {
            menor = n1;
            maior = n2;
        } else {
            menor = n2;
            maior = n1;
        }

        if (menor % 2 == 0) {
            menor += + 1;
        } else {
            menor += + 2;
        }

        if (maior % 2 != 0) {
            maior += - 1;
        }

        for (int i = menor; i < maior; i += 2) {
            soma += i;
        }

        System.out.println("SOMA DOS IMPARES = " + soma);

        sc.close();
    }
}
