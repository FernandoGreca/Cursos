package exercicios;

import java.util.*;

public class crescente {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        n1 = 1;
        n2 = 2;

        while (n1 != n2) {
            System.out.println("Digite dois numeros: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            if (n1 < n2) {
                System.out.println("CRESCENTE!!");
            } else if (n2 < n1) {
                System.out.println("DECRESCENTE!!");
            }
        }

        sc.close();
    }
}
