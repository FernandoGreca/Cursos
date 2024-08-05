package exercicios;

import java.util.*;

public class diagonal_negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int negativo = 0;

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento[" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();

                if (mat[i][j] < 0) {
                    negativo = negativo + 1;
                }
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " "); 
                }
            }
        }
        System.out.println();

        System.out.println("QUANTIDADE DE NEGATIVOS = " + negativo);

        sc.close();
    }
}
