package exercicios;

import java.util.*;

public class menor_de_tres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int menor;

        System.out.print("Primeiro Valor: ");
        int n1 = sc.nextInt();

        System.out.print("Segundo Valor: ");
        int n2 = sc.nextInt();

        System.out.print("Terceiro Valor: ");
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        }
        else if (n2 < n1 && n2 < n3){
            menor = n2;
        }
        else {
            menor = n3;
        }

        System.out.println("MENOR = " + menor);

        sc.close();
    }
}

